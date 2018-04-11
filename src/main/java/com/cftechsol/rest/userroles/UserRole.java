package com.cftechsol.rest.userroles;

import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.cftechsol.rest.entities.GenericAuditEntity;
import com.cftechsol.rest.roles.Role;
import com.cftechsol.rest.users.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_role")
public class UserRole extends GenericAuditEntity<UserRolePK> {
	
	private static final long serialVersionUID = -7345772620617257769L;

	@EmbeddedId
	private UserRolePK id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("userId")
	@JoinColumn(foreignKey = @ForeignKey(name = "user_role_fk1"))
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("roleId")
	@JoinColumn(foreignKey = @ForeignKey(name = "user_role_fk2"))
	private Role role;
	
	public UserRole(User user, Role role) {
		this.user = user;
		this.role = role;
		this.id = new UserRolePK(user.getId(), role.getId());
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
 
        if (o == null || getClass() != o.getClass())
            return false;
 
        UserRole that = (UserRole) o;
        return Objects.equals(user, that.user) &&
               Objects.equals(role, that.role);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(user, role);
    }

}