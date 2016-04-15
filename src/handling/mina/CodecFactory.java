package handling.mina;

import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;

public class CodecFactory implements ProtocolCodecFactory {

    private final ProtocolEncoder encoder = new PacketEncoder();
    private final ProtocolDecoder decoder = new PacketDecoder();

    public ProtocolEncoder getEncoder() throws Exception {
	return encoder;
    }

    public ProtocolDecoder getDecoder() throws Exception {
	return decoder;
    }
}
