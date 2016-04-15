package handling.mina;

import client.MapleClient;
import tools.MapleAESOFB;
import tools.MapleCustomEncryption;

import org.apache.mina.common.ByteBuffer;
import org.apache.mina.common.IoSession;
import org.apache.mina.filter.codec.CumulativeProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

public class PacketDecoder extends CumulativeProtocolDecoder {

    @Override
    protected boolean doDecode(IoSession session, ByteBuffer in, ProtocolDecoderOutput out) throws Exception {
        //System.out.println(in.toString());
        in.get(); //Needs to happen to consume the buffer.
        out.write(in.array());//No decoding, just pass the array on through. 
        return true;
    }
}