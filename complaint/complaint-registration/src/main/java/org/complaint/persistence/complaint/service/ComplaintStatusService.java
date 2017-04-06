

package org.complaint.persistence.complaint.service;

import java.util.List;

import org.complaint.persistence.complaint.entity.ComplaintStatus;
import org.complaint.persistence.complaint.repository.ComplaintStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ComplaintStatusService {

	@Autowired
	private ComplaintStatusRepository complaintStatusRepository;

	public ComplaintStatus getByName(String name) {

		return complaintStatusRepository.findByName(name);
	}
	
	public List<ComplaintStatus> getAll() {

		return complaintStatusRepository.findAll();
	}


}
