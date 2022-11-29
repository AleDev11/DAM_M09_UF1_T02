package font.alejandro.dam.m09.uf1.t02.model.service;

import org.apache.commons.codec.digest.MessageDigestAlgorithms;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class EncriptacionSha256Service {
    public String encripta(String _textEncriptar) {
        String result = null;

        try {
            MessageDigest md = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            md.update(_textEncriptar.getBytes());
            byte[] digestBytes = md.digest();

            result = Base64.getEncoder().encodeToString(digestBytes);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return result;
    }
}
