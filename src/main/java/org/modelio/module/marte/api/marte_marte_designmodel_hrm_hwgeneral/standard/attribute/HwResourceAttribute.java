/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.ResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8abfe83b-030b-4c68-a7d4-cb7f0ddee8dd")
public class HwResourceAttribute extends ResourceAttribute {
    @objid ("8f81a498-728a-47c2-996f-3f54ef2fdb95")
    public static final String STEREOTYPE_NAME = "HwResource_Attribute";

    @objid ("89f5601d-8bc6-477e-89f6-c2daf2e80f79")
    public static final String HWRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE = "HwResource_Attribute_description";

    @objid ("1a03a02a-f6f5-4a10-81e1-5fe156939fe8")
    public static final String HWRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE = "HwResource_Attribute_endPoints";

    @objid ("08b913c2-5ace-4f46-990c-2c650eb32ae5")
    public static final String HWRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE = "HwResource_Attribute_frequency";

    @objid ("485e5ce3-2ad5-433b-a20f-d1af4c82d987")
    public static final String HWRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE = "HwResource_Attribute_ownedHW";

    @objid ("24618c41-c050-4eb2-94a3-2c03aae70d62")
    public static final String HWRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE = "HwResource_Attribute_p_HW_Services";

    @objid ("37ad1d0a-4cdb-40ba-b569-3dc96b508faf")
    public static final String HWRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE = "HwResource_Attribute_r_HW_Services";

    /**
     * Tells whether a {@link HwResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ba54c052-defc-4fc3-a9d5-b79c965aa960")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwResource_Attribute >> then instantiate a {@link HwResourceAttribute} proxy.
     * 
     * @return a {@link HwResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("3363313e-75c6-4376-b158-1c3b25f7dcb6")
    public static HwResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceAttribute.STEREOTYPE_NAME);
        return HwResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceAttribute} proxy from a {@link Attribute} stereotyped << HwResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("7c6f9384-8ee1-4afd-90a8-2fbae19ce0ff")
    public static HwResourceAttribute instantiate(final Attribute obj) {
        return HwResourceAttribute.canInstantiate(obj) ? new HwResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceAttribute} proxy from a {@link Attribute} stereotyped << HwResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d1ddeb0f-6836-4727-b55e-e4c32fcfa857")
    public static HwResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwResourceAttribute.canInstantiate(obj))
        	return new HwResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("HwResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dd068496-0eb8-474b-bd89-b257336248c4")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        HwResourceAttribute other = (HwResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("d2374b24-e05e-4064-a045-b8a47b0f7b9c")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwResource_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("16d8e655-1971-420b-9255-9a50098b9d56")
    public String getHwResource_Attribute_description() {
        return this.elt.getTagValue(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Attribute_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("adcece0c-7c4f-480f-968f-dbe6a9b1340a")
    public List<String> getHwResource_Attribute_endPoints() {
        return this.elt.getTagValues(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResource_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9597ed76-2b33-4e8a-ab49-33f53c4a12b6")
    public String getHwResource_Attribute_frequency() {
        return this.elt.getTagValue(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Attribute_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b80bd5bf-999d-4a63-aee6-781d2483d369")
    public List<String> getHwResource_Attribute_ownedHW() {
        return this.elt.getTagValues(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Attribute_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("56ad9b52-4f39-4425-bcfb-cea0f8648400")
    public List<String> getHwResource_Attribute_p_HW_Services() {
        return this.elt.getTagValues(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Attribute_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("19eed614-1716-40df-b799-3bb6156501c4")
    public List<String> getHwResource_Attribute_r_HW_Services() {
        return this.elt.getTagValues(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("1abfd7e5-a57b-4ebd-83ed-924ad6f7706b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResource_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3618e6fd-5ccd-4e13-bb2f-44c6867137f8")
    public void setHwResource_Attribute_description(final String value) {
        this.elt.putTagValue(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Attribute_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ee8aea93-8e84-46f5-a5c3-372a01a29202")
    public void setHwResource_Attribute_endPoints(final List<String> values) {
        this.elt.putTagValues(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwResource_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("37beef46-5ec3-4097-8254-11f7bb43ea6f")
    public void setHwResource_Attribute_frequency(final String value) {
        this.elt.putTagValue(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Attribute_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("78aed9e1-f611-40f5-859f-b1bf93114d3b")
    public void setHwResource_Attribute_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Attribute_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9012fe73-2688-46fd-9cf0-32546767e9d8")
    public void setHwResource_Attribute_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Attribute_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dde942bf-576d-403f-a8a1-1462e4fda8d5")
    public void setHwResource_Attribute_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("9e40507f-5a29-45b5-86f4-49649bd5c225")
    protected HwResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("0d4ac5f5-f188-4ce3-8ddf-34d50f351f08")
    public static final class MdaTypes {
        @objid ("8fe28981-9d1c-4272-84e8-77375f22e591")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("85b3804a-60b0-46cf-a9d2-97e27fb2aadf")
        public static TagType HWRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("e5f4b8a1-ec7c-4f36-86f2-bb52ab4f53ad")
        public static TagType HWRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("38a09cbd-db96-4abb-a88b-50f07b1eae7e")
        public static TagType HWRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("4636b79e-d882-41f5-b694-b148c4b0ce80")
        public static TagType HWRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT;

        @objid ("b781a3a6-0468-4b90-9360-80ec18cd4f43")
        public static TagType HWRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT;

        @objid ("c6ffb7aa-de74-4820-ac1b-78edd2bfd56e")
        public static TagType HWRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("784498d0-3a79-44ed-84e5-44e653611483")
        private static Stereotype MDAASSOCDEP;

        @objid ("0e9d6998-a796-435d-9c79-e86dbc26b36a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("087dff0b-f4fe-4bfa-addc-3750477d5369")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00dae376-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff66-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff6d-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff74-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "019bff7b-0ccf-11df-8525-001302895b2b");
            HWRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cd16fc6c-1013-11df-86fe-0014222a9f79");
            HWRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "35cae727-1709-11df-b92a-0014222a9f79");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
