package link.yauritux.loans.service;

import link.yauritux.loans.dto.LoansDto;

public interface ILoansService {

    /**
     *
     * @param mobileNumber - Mobile number of the Customer
     */
    void createLoan(String mobileNumber);

    /**
     *
     * @param mobileNumber - Input mobile number
     * @return Loan details based on a given mobile number
     */
    LoansDto fetchLoan(String mobileNumber);

    /**
     *
     * @param loansDto - LoansDto object
     * @return boolean indicating if the update of card details is successful or not
     */
    boolean updateLoan(LoansDto loansDto);

    /**
     *
     * @param mobileNumber - Input mobile number
     * @return boolean indicating if the delete of loan details is successful or not
     */
    boolean deleteLoan(String mobileNumber);
}
