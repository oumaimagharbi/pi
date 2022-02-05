package tn.esprit.spring.enumuration;

public enum Role {
   Admin,Client,Agent ;
   
   private String[] authorities;

   Role(String... authorities) {
       this.authorities = authorities;
   }

   public String[] getAuthorities() {
       return authorities;
   }
}
