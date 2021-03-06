package org.eneuwirt;

import org.springframework.security.access.prepost.PreAuthorize;

public interface SecuredService
{
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	void adminSomething();


	@PreAuthorize("hasRole('ROLE_USER')")
	void doSomething();
}
