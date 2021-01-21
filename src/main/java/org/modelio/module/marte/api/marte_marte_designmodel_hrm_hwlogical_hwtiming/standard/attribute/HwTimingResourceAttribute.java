/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.attribute;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.attribute.TimingResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwTimingResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b73cfa4a-a6f4-4ffe-a492-26f8cd9057b7")
public class HwTimingResourceAttribute extends TimingResourceAttribute {
    @objid ("ffeec20c-c23b-402c-861a-79f2e72f58d8")
    public static final String STEREOTYPE_NAME = "HwTimingResource_Attribute";

    @objid ("dbfb4020-0098-40bd-9cec-1ea9982c4871")
    public static final String HWTIMINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE = "HwTimingResource_Attribute_description";

    @objid ("59799e57-60d3-40ff-8dd5-36fbb56b47eb")
    public static final String HWTIMINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE = "HwTimingResource_Attribute_endPoints";

    @objid ("468f9e3e-60d2-4a0e-abea-e2317ebe4303")
    public static final String HWTIMINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE = "HwTimingResource_Attribute_frequency";

    @objid ("6264d25b-1d2a-4ebd-9fe7-3c52897d0b75")
    public static final String HWTIMINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE = "HwTimingResource_Attribute_ownedHW";

    @objid ("167056fc-b346-469c-a342-8b5b934402e8")
    public static final String HWTIMINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE = "HwTimingResource_Attribute_p_HW_Services";

    @objid ("2edbf1aa-b28c-492c-8600-92b1b8a8249a")
    public static final String HWTIMINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE = "HwTimingResource_Attribute_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwTimingResource_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("74371a7d-1136-4591-9354-828485a5b7b1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwTimingResource_Attribute >> then instantiate a {@link HwTimingResourceAttribute} proxy.
     * 
     * @return a {@link HwTimingResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("ec5050c7-2b44-4c0e-80dd-f55d0624670b")
    public static HwTimingResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceAttribute.STEREOTYPE_NAME);
        return HwTimingResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceAttribute} proxy from a {@link Attribute} stereotyped << HwTimingResource_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwTimingResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("1b9643d7-0a67-4ab3-98de-112b4083f8d0")
    public static HwTimingResourceAttribute instantiate(final Attribute obj) {
        return HwTimingResourceAttribute.canInstantiate(obj) ? new HwTimingResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceAttribute} proxy from a {@link Attribute} stereotyped << HwTimingResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwTimingResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b77be6c7-547a-4799-bfaf-65f2b2b0aa51")
    public static HwTimingResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwTimingResourceAttribute.canInstantiate(obj))
        	return new HwTimingResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("20cc898d-f04a-4527-ab8a-c9b8a7c135c3")
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
        HwTimingResourceAttribute other = (HwTimingResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("6d1066a3-7684-4838-9a84-6918d14a5980")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwTimingResource_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f658278-d3ce-4e5b-9a8f-48da7ba7bf2d")
    public String getHwTimingResource_Attribute_description() {
        return this.elt.getTagValue(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Attribute_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("71800188-3045-4cce-8e83-38d57665d4e9")
    public List<String> getHwTimingResource_Attribute_endPoints() {
        return this.elt.getTagValues(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("61638ff2-4106-4181-981c-f9fc571b20b5")
    public String getHwTimingResource_Attribute_frequency() {
        return this.elt.getTagValue(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Attribute_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4b3ac5f3-22c9-4097-a20f-e16f5f855136")
    public List<String> getHwTimingResource_Attribute_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Attribute_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6dbfdb45-5b6b-4bab-84c1-2234eab27450")
    public List<String> getHwTimingResource_Attribute_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Attribute_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("2d6fb60f-b5b9-41dc-8b9b-62b530c07788")
    public List<String> getHwTimingResource_Attribute_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("e196ad8b-b493-4153-affb-c650fcf8c4a8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d6365bf6-7c29-4af2-89da-a399156f8388")
    public void setHwTimingResource_Attribute_description(final String value) {
        this.elt.putTagValue(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Attribute_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("01cd09a7-f9b7-4034-b799-2b6712b70591")
    public void setHwTimingResource_Attribute_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1a797585-3992-4299-8afd-586ab265fe7a")
    public void setHwTimingResource_Attribute_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Attribute_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ac39661f-d4f6-4173-8e45-a44f3d7fd708")
    public void setHwTimingResource_Attribute_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Attribute_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2f6d7bfb-e3a5-4d22-ac4a-03fc748dea9a")
    public void setHwTimingResource_Attribute_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Attribute_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("da7dc7ea-9a23-4e6d-81cc-4af8d3f3dcf9")
    public void setHwTimingResource_Attribute_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("5bc18ef5-5dda-412e-8bb6-49eed89ab160")
    protected HwTimingResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("a98abb9a-06f0-476c-967d-ab7dc0d33c6c")
    public static final class MdaTypes {
        @objid ("e7e05fcf-0917-4bfc-ae99-7c2e886f10ed")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fb8a8b4b-1899-44e8-8fa6-c2348ae696fe")
        public static TagType HWTIMINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("9a960fc6-05c3-4e1e-ab0c-74695bbc2736")
        public static TagType HWTIMINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("a7a32bb0-f2e2-4939-b79c-5c567d6517aa")
        public static TagType HWTIMINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("cde1dbf3-2586-4d4f-aeab-7ce027d6bf4e")
        public static TagType HWTIMINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT;

        @objid ("4b1f28fa-3a44-423f-ab13-e2e65de05bf3")
        public static TagType HWTIMINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("0924b103-84e7-4f30-ba29-ee75689faa6a")
        public static TagType HWTIMINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT;

        @objid ("3ca37029-1146-4d86-a7ba-7dce137659f5")
        private static Stereotype MDAASSOCDEP;

        @objid ("f6de2669-e72a-4183-9eb1-63c6a99c3226")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3cd24524-c3b0-4b49-b63e-56ee6302987d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01226913-0ccf-11df-8525-001302895b2b");
            HWTIMINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3f83b25a-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3f83b25b-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3f83b25c-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3f83b25d-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c14fd363-1709-11df-b92a-0014222a9f79");
            HWTIMINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6b6b4e08-8dfb-11e0-8741-0027103f347c");
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
