package org.colorcoding.ibas.businesspartner.repository;

import org.colorcoding.ibas.bobas.common.*;
import org.colorcoding.ibas.bobas.ownership.*;
import org.colorcoding.ibas.bobas.repository.*;
import org.colorcoding.ibas.businesspartner.bo.businesspartnergroup.*;
import org.colorcoding.ibas.businesspartner.bo.contactperson.*;
import org.colorcoding.ibas.businesspartner.bo.customer.*;
import org.colorcoding.ibas.businesspartner.bo.supplier.*;

/**
* BusinessPartner仓库
*/
@PermissionGroup("BusinessPartner")
public class BORepositoryBusinessPartner extends BORepositoryServiceApplication implements IBORepositoryBusinessPartnerSvc, IBORepositoryBusinessPartnerApp {

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-业务伙伴组
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    public OperationResult<BusinessPartnerGroup> fetchBusinessPartnerGroup(ICriteria criteria, String token) {
        return super.fetch(criteria, token, BusinessPartnerGroup.class);
    }

    /**
     * 查询-业务伙伴组（提前设置用户口令）
     * @param criteria 查询
     * @return 操作结果
     */
    public IOperationResult<IBusinessPartnerGroup> fetchBusinessPartnerGroup(ICriteria criteria) {
        return new OperationResult<IBusinessPartnerGroup>(this.fetchBusinessPartnerGroup(criteria, this.getUserToken()));
    }

    /**
     * 保存-业务伙伴组
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    public OperationResult<BusinessPartnerGroup> saveBusinessPartnerGroup(BusinessPartnerGroup bo, String token) {
        return super.save(bo, token);
    }

    /**
     * 保存-业务伙伴组（提前设置用户口令）
     * @param bo 对象实例
     * @return 操作结果
     */
    public IOperationResult<IBusinessPartnerGroup> saveBusinessPartnerGroup(IBusinessPartnerGroup bo) {
        return new OperationResult<IBusinessPartnerGroup>(this.saveBusinessPartnerGroup((BusinessPartnerGroup) bo, this.getUserToken()));
    }

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-业务伙伴联系人
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    public OperationResult<ContactPerson> fetchContactPerson(ICriteria criteria, String token) {
        return super.fetch(criteria, token, ContactPerson.class);
    }

    /**
     * 查询-业务伙伴联系人（提前设置用户口令）
     * @param criteria 查询
     * @return 操作结果
     */
    public IOperationResult<IContactPerson> fetchContactPerson(ICriteria criteria) {
        return new OperationResult<IContactPerson>(this.fetchContactPerson(criteria, this.getUserToken()));
    }

    /**
     * 保存-业务伙伴联系人
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    public OperationResult<ContactPerson> saveContactPerson(ContactPerson bo, String token) {
        return super.save(bo, token);
    }

    /**
     * 保存-业务伙伴联系人（提前设置用户口令）
     * @param bo 对象实例
     * @return 操作结果
     */
    public IOperationResult<IContactPerson> saveContactPerson(IContactPerson bo) {
        return new OperationResult<IContactPerson>(this.saveContactPerson((ContactPerson) bo, this.getUserToken()));
    }

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-业务伙伴-客户
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    public OperationResult<Customer> fetchCustomer(ICriteria criteria, String token) {
        return super.fetch(criteria, token, Customer.class);
    }

    /**
     * 查询-业务伙伴-客户（提前设置用户口令）
     * @param criteria 查询
     * @return 操作结果
     */
    public IOperationResult<ICustomer> fetchCustomer(ICriteria criteria) {
        return new OperationResult<ICustomer>(this.fetchCustomer(criteria, this.getUserToken()));
    }

    /**
     * 保存-业务伙伴-客户
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    public OperationResult<Customer> saveCustomer(Customer bo, String token) {
        return super.save(bo, token);
    }

    /**
     * 保存-业务伙伴-客户（提前设置用户口令）
     * @param bo 对象实例
     * @return 操作结果
     */
    public IOperationResult<ICustomer> saveCustomer(ICustomer bo) {
        return new OperationResult<ICustomer>(this.saveCustomer((Customer) bo, this.getUserToken()));
    }

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-业务伙伴-供应商
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    public OperationResult<Supplier> fetchSupplier(ICriteria criteria, String token) {
        return super.fetch(criteria, token, Supplier.class);
    }

    /**
     * 查询-业务伙伴-供应商（提前设置用户口令）
     * @param criteria 查询
     * @return 操作结果
     */
    public IOperationResult<ISupplier> fetchSupplier(ICriteria criteria) {
        return new OperationResult<ISupplier>(this.fetchSupplier(criteria, this.getUserToken()));
    }

    /**
     * 保存-业务伙伴-供应商
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    public OperationResult<Supplier> saveSupplier(Supplier bo, String token) {
        return super.save(bo, token);
    }

    /**
     * 保存-业务伙伴-供应商（提前设置用户口令）
     * @param bo 对象实例
     * @return 操作结果
     */
    public IOperationResult<ISupplier> saveSupplier(ISupplier bo) {
        return new OperationResult<ISupplier>(this.saveSupplier((Supplier) bo, this.getUserToken()));
    }

    //--------------------------------------------------------------------------------------------//

}