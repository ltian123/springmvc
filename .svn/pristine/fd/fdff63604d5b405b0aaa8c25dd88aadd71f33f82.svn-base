package converter;

import org.springframework.core.convert.converter.Converter;

import entity.Address;

public class StringToAddressConverter implements Converter<String, Address> {

	public Address convert(String text) {
		String[] s=text.split("-");
		Address address=new Address();
		address.setProvince(s[0]);
		address.setCity(s[1]);
		return address;
	}


}

