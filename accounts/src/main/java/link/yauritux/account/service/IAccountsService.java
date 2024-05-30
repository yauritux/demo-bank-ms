package link.yauritux.account.service;

import link.yauritux.account.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - customerDto object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Accounts details based on a given mobileNumber
     */
    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto - CustomerDto object
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the deletion of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
