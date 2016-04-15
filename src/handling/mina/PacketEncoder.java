package handling.mina;

import client.MapleClient;

import tools.MapleAESOFB;
import tools.MapleCustomEncryption;

import java.util.concurrent.locks.Lock;

import org.apache.mina.common.ByteBuffer;
import org.apache.mina.common.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoder;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

public class PacketEncoder implements ProtocolEncoder {

    @Override
    public void encode(final IoSession session, final Object message, final ProtocolEncoderOutput out) throws Exception {
        byte[] bytes = (byte[]) message;
        ByteBuffer buffer = ByteBuffer.allocate( bytes.length, false );
        buffer.putInt(bytes.length);
        buffer.put(bytes);
        buffer.flip();
        out.write(buffer);
   }


    @Override
    public void dispose(IoSession session) throws Exception {
	// nothing to do
    }
}
