package com.luizacode.Coffee_is_the_new_Code.dto;

import com.luizacode.Coffee_is_the_new_Code.model.WishList;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
public class CustomerOutputDto {

    private Long id;
    private String nome;
    private String email;
    private String password;
    private WishList wishList;

    public CustomerOutputDto() {
    }

    public CustomerOutputDto(Long id, String nome, String email, String password,
        WishList wishList) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.wishList = wishList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public WishList getWishList() {
        return wishList;
    }

    public void setWishList(WishList wishList) {
        this.wishList = wishList;
    }
}
