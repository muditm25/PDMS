package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class Package {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(unique=true)
	private String pkg_id;
	@Type(type="yes_no")
	private boolean collect_status = false;
	private String provider_name;
	private String pkg_entry_time;
	private String pkg_collect_time;
	@Type(type="yes_no")
	private boolean storeroom_status = false;
	private String reciever_name;
	
	public Package() {
		super();
	}
	
	public Package(String pkd_id,boolean collect_status,String provider_name,
			String pkg_entry_time,String pkg_collect_time,
			boolean storeroom_status,String receiver_name) {
		
		super();
		this.pkg_id = pkd_id;
		this.collect_status = collect_status;
		this.provider_name = provider_name;
		this.pkg_entry_time = pkg_entry_time;
		this.pkg_collect_time = pkg_collect_time;
		this.storeroom_status = storeroom_status;
		this.reciever_name = receiver_name;
		
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPkg_id() {
		return pkg_id;
	}
	public void setPkg_id(String pkg_id) {
		this.pkg_id = pkg_id;
	}
	public boolean isCollect_status() {
		return collect_status;
	}
	public void setCollect_status(boolean collect_status) {
		this.collect_status = collect_status;
	}
	public String getProvider_name() {
		return provider_name;
	}
	public void setProvider_name(String provider_name) {
		this.provider_name = provider_name;
	}
	public String getPkg_entry_time() {
		return pkg_entry_time;
	}
	public void setPkg_entry_time(String pkg_entry_time) {
		this.pkg_entry_time = pkg_entry_time;
	}
	public String getPkg_collect_time() {
		return pkg_collect_time;
	}
	public void setPkg_collect_time(String pkg_collect_time) {
		this.pkg_collect_time = pkg_collect_time;
	}
	public boolean isStoreroom_status() {
		return storeroom_status;
	}
	public void setStoreroom_status(boolean storeroom_status) {
		this.storeroom_status = storeroom_status;
	}
	public String getReciever_name() {
		return reciever_name;
	}
	public void setReciever_name(String reciever_name) {
		this.reciever_name = reciever_name;
	}
	
}
