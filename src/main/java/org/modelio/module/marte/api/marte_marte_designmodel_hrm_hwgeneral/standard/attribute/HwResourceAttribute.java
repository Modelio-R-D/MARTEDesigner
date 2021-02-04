/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("fc2f8883-9881-439c-ac49-1e7566ac2059")
    public static final String STEREOTYPE_NAME = "HwResource_Attribute";

    @objid ("152749cf-41a5-4a2b-a784-5097e60f22c4")
    public static final String HWRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE = "HwResource_Attribute_description";

    @objid ("43321fe7-e79f-4daa-97ee-84a2e066b266")
    public static final String HWRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE = "HwResource_Attribute_endPoints";

    @objid ("54d11df8-48ea-4175-82e9-3ba46a454f3e")
    public static final String HWRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE = "HwResource_Attribute_frequency";

    @objid ("130f77b9-7126-40c2-bbd4-af57d36b9914")
    public static final String HWRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE = "HwResource_Attribute_ownedHW";

    @objid ("9952dffa-7b52-4bfe-9999-fc2b0247f3d4")
    public static final String HWRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE = "HwResource_Attribute_p_HW_Services";

    @objid ("df76adb5-fdf4-4c0e-89ab-5ee58ffd2272")
    public static final String HWRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE = "HwResource_Attribute_r_HW_Services";

    /**
     * Tells whether a {@link HwResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("227548ba-e807-43a3-ba91-2a9496acf505")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwResource_Attribute >> then instantiate a {@link HwResourceAttribute} proxy.
     * 
     * @return a {@link HwResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("76bd408f-afa3-4ea4-aff1-e7fd5070b099")
    public static HwResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceAttribute.STEREOTYPE_NAME);
        return HwResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceAttribute} proxy from a {@link Attribute} stereotyped << HwResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("8c9a10d4-d905-4ee1-b8b9-a18cd89880f1")
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
    @objid ("d02b257c-4c0f-470c-8f9e-151fbbafff78")
    public static HwResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwResourceAttribute.canInstantiate(obj))
        	return new HwResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("HwResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e52c389b-8ea2-4543-867e-067e28bc6c69")
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
    @objid ("85881319-de21-4fb1-a0d7-ff72f51bd9af")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwResource_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("28d6298d-a20c-4712-a819-14c28e3dc2a8")
    public String getHwResource_Attribute_description() {
        return this.elt.getTagValue(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Attribute_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4559b68c-c6ab-4ac1-99bb-ac062cd11d71")
    public List<String> getHwResource_Attribute_endPoints() {
        return this.elt.getTagValues(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResource_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("07b304fd-46bb-46bf-87ce-e4d617b78378")
    public String getHwResource_Attribute_frequency() {
        return this.elt.getTagValue(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Attribute_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("145cb9d4-5b0f-4588-9a5b-1802f4e1cf19")
    public List<String> getHwResource_Attribute_ownedHW() {
        return this.elt.getTagValues(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Attribute_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8e6d33b3-9ad4-42ec-8b16-e424251b0ca4")
    public List<String> getHwResource_Attribute_p_HW_Services() {
        return this.elt.getTagValues(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Attribute_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7fc096de-c52e-447c-9122-3f461db3f31b")
    public List<String> getHwResource_Attribute_r_HW_Services() {
        return this.elt.getTagValues(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("350913da-bc00-483a-8a1e-e8db31982a0d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResource_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("852d901d-adf5-4ea3-ba44-496fefbad01f")
    public void setHwResource_Attribute_description(final String value) {
        this.elt.putTagValue(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Attribute_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("900f410e-2c1c-4b81-8159-43eda3129978")
    public void setHwResource_Attribute_endPoints(final List<String> values) {
        this.elt.putTagValues(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwResource_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3bebb348-64e8-4463-9f93-9f8ed15d97e8")
    public void setHwResource_Attribute_frequency(final String value) {
        this.elt.putTagValue(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Attribute_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e455154d-3a3a-4363-9c65-d8089b78c46c")
    public void setHwResource_Attribute_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Attribute_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c70ce4e0-8d43-46f1-a075-270a0ded676e")
    public void setHwResource_Attribute_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Attribute_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("796d30cf-185b-48ff-ac07-fdc032ceffe2")
    public void setHwResource_Attribute_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceAttribute.MdaTypes.HWRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("ddea644e-14f8-4ef5-8960-913b28e9a586")
    protected HwResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("0d4ac5f5-f188-4ce3-8ddf-34d50f351f08")
    public static final class MdaTypes {
        @objid ("d74bc9cc-450c-4558-8dec-ed152552b9cf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fcc7955b-b739-4d73-8262-1fb4e76ff9ff")
        public static TagType HWRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("8727b04d-36a4-41cf-8cd4-27d8f2333039")
        public static TagType HWRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("457a1cfe-3044-4a84-ad0e-ce5854862720")
        public static TagType HWRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("9a57bd24-8a03-45d6-98de-a52cdbfb83f0")
        public static TagType HWRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT;

        @objid ("06a5bc82-173f-4e90-9173-5cba4a71ffb5")
        public static TagType HWRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT;

        @objid ("29c15585-7c1f-4d7a-8ce0-535b3dd3a204")
        public static TagType HWRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("68e6efd1-515c-46fc-9fba-ac33d58ea35f")
        private static Stereotype MDAASSOCDEP;

        @objid ("43abec63-9deb-43f9-b68b-0cb4bba9d3a2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("684c2993-9d5d-42b1-bc24-569b4bf519a4")
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
