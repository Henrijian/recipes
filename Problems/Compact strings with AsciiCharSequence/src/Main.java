import java.util.*;

class AsciiCharSequence implements CharSequence {
    private byte[] bytes;

    public AsciiCharSequence(byte[] bytes) {
        this.bytes = Arrays.copyOf(bytes, bytes.length);
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int i) {
        return (char) bytes[i];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] buffer = new byte[end - start];
        System.arraycopy(bytes, start, buffer, 0, buffer.length);
        return new AsciiCharSequence(buffer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append((char) b);
        }
        return sb.toString();
    }
}