package domain.models;

import domain.enums.ClientType;

import java.util.Objects;

public class Client {
    private String identifier;
    private String fullName;
    private String email;
    private ClientType type;
    private String contact;

    public Client() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return identifier.equals(client.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier);
    }

    public Client(String identifier, String fullName, String email, ClientType type, String contact) {
        this.identifier = identifier;
        this.fullName = fullName;
        this.email = email;
        this.type = type;
        this.contact = contact;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ClientType getType() {
        return type;
    }

    public void setType(ClientType type) {
        this.type = type;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
