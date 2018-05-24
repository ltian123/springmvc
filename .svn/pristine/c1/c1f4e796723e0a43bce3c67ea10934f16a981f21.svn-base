package converter;

import org.springframework.core.convert.converter.Converter;

import entity.Address;

public class AddressToStringConverter implements Converter<Address, String> {

	public String convert(Address address) {
		return address.getProvince()+"-"+address.getCity();
	}

}
