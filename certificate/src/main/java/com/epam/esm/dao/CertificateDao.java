package com.epam.esm.dao;

import com.epam.esm.dto.CertificatesRequest;
import com.epam.esm.dto.PageData;
import com.epam.esm.dto.PaginationParameter;
import com.epam.esm.entity.Certificate;

import java.util.Optional;

/** The interface Certificate dao. */
public interface CertificateDao {

  /**
   * Create certificate dto with tags.
   *
   * @param certificate the certificate
   * @return the certificate dto with tags
   */
  Certificate create(Certificate certificate);

  /**
   * Read optional.
   *
   * @param id the id
   * @return the optional
   */
  Optional<Certificate> read(long id);

  /**
   * Read all page data.
   *
   * @param request the request contains sorting and filtering staff
   * @param parameter the parameter of pagination
   * @return the page data
   */
  PageData<Certificate> readAll(CertificatesRequest request, PaginationParameter parameter);

  /**
   * Update.
   *
   * @param certificate the certificate
   */
  void update(Certificate certificate);

  /**
   * Delete.
   *
   * @param id the id
   */
  void delete(long id);

  /**
   * Add tag.
   *
   * @param tagId the tag id
   * @param certificateId the certificate id
   */
  void addTag(long tagId, long certificateId);

  /**
   * Remove tag int.
   *
   * @param tagId the tag id
   * @param certificateId the certificate id
   * @return the int number of changed rows
   */
  int removeTag(long tagId, long certificateId);

  /**
   * Update presented fields.
   *
   * @param certificate the certificate
   */
  void updatePresentedFields(Certificate certificate);
}
