package data;

import java.io.Serializable;

public class Data implements Serializable {
    private static final long serialVersionUID = 1L;

    private String status;
    private String name;
    private byte[] file;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return name;
    }
}
