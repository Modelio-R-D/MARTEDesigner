/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("2a10d501-fadc-4381-b6b6-1cb2dbc63ee6")
    public static final String STEREOTYPE_NAME = "HwTimingResource_Attribute";

    @objid ("4b53bf2a-5594-47ac-92ca-6d174c3efc4f")
    public static final String HWTIMINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE = "HwTimingResource_Attribute_description";

    @objid ("39b4d9cd-b816-4219-88b1-bdb42c4cb541")
    public static final String HWTIMINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE = "HwTimingResource_Attribute_endPoints";

    @objid ("7c53e781-0b28-4b62-bc66-9eee880de432")
    public static final String HWTIMINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE = "HwTimingResource_Attribute_frequency";

    @objid ("9c1eb39a-ea5e-46ae-8ae4-abaf8820aed8")
    public static final String HWTIMINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE = "HwTimingResource_Attribute_ownedHW";

    @objid ("353341a6-4d7a-4899-9fb2-10d08db7c611")
    public static final String HWTIMINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE = "HwTimingResource_Attribute_p_HW_Services";

    @objid ("3a0e9b37-ea86-4c7a-9035-1f77b5fbd96f")
    public static final String HWTIMINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE = "HwTimingResource_Attribute_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwTimingResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("45f6eb3b-d85a-4ac6-8f7c-3064280cbd6b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwTimingResource_Attribute >> then instantiate a {@link HwTimingResourceAttribute} proxy.
     * 
     * @return a {@link HwTimingResourceAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("27f09e4a-02ab-4ad1-b649-5ba15db70910")
    public static HwTimingResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceAttribute.STEREOTYPE_NAME);
        return HwTimingResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceAttribute} proxy from a {@link Attribute} stereotyped << HwTimingResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwTimingResourceAttribute} proxy or <i>null</i>.
     */
    @objid ("cd8c3b03-a0c5-4f03-ac3c-37d211f62be5")
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
    @objid ("fd5c84d4-e0d9-4d69-b02e-09f76668ffef")
    public static HwTimingResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwTimingResourceAttribute.canInstantiate(obj))
        	return new HwTimingResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("091231b1-15ed-41b0-8a25-210d7ff38890")
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
    @objid ("a44c166a-427b-40a4-91c0-41a4186a95d9")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwTimingResource_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d6698b8b-8adb-4ad5-b4ce-1a52164753a9")
    public String getHwTimingResource_Attribute_description() {
        return this.elt.getTagValue(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Attribute_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f1168397-0add-4793-bf4f-e1de7460389a")
    public List<String> getHwTimingResource_Attribute_endPoints() {
        return this.elt.getTagValues(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("47bff493-ac03-40a1-a069-b0a075af933b")
    public String getHwTimingResource_Attribute_frequency() {
        return this.elt.getTagValue(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Attribute_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("964292d0-ee30-4560-a05c-7aca4fc32517")
    public List<String> getHwTimingResource_Attribute_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Attribute_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f6ede6a3-d62e-44e4-8504-16fc15baefcf")
    public List<String> getHwTimingResource_Attribute_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Attribute_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d0911d62-a95b-4820-b286-4a126cb5b281")
    public List<String> getHwTimingResource_Attribute_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("13b38192-41b9-4f52-9085-f5a3d71101f0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_Attribute_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fe3b0300-4bda-40e7-ba32-3e558490d9ed")
    public void setHwTimingResource_Attribute_description(final String value) {
        this.elt.putTagValue(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Attribute_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c191678a-fae0-4486-9434-381c782c587c")
    public void setHwTimingResource_Attribute_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_Attribute_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("07382091-6167-4e4b-8c48-e1d3c03f187e")
    public void setHwTimingResource_Attribute_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Attribute_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eb77772c-5c99-429c-bbf1-13113fa23ad5")
    public void setHwTimingResource_Attribute_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Attribute_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6f2fc9b9-710e-467d-9476-c8be5d966edd")
    public void setHwTimingResource_Attribute_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Attribute_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eeea66aa-f0be-44b8-92b4-48fa3296a5c2")
    public void setHwTimingResource_Attribute_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceAttribute.MdaTypes.HWTIMINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("e5685542-f716-4d21-b12a-e1192e2e59a6")
    protected HwTimingResourceAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("a98abb9a-06f0-476c-967d-ab7dc0d33c6c")
    public static final class MdaTypes {
        @objid ("cd0d7e49-e4e4-4137-9fb3-bca597493177")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d43bd139-b01c-4d0b-b882-5bc37a1a56a4")
        public static TagType HWTIMINGRESOURCE_ATTRIBUTE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("d6b27c57-e972-4019-9d10-5cecd04ca90c")
        public static TagType HWTIMINGRESOURCE_ATTRIBUTE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("2d2fa9f9-8066-45f7-b8cb-89b2a8f90508")
        public static TagType HWTIMINGRESOURCE_ATTRIBUTE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("f4eb24a3-db95-4138-af52-e4099aebde64")
        public static TagType HWTIMINGRESOURCE_ATTRIBUTE_OWNEDHW_TAGTYPE_ELT;

        @objid ("64b38df4-45aa-4454-80c3-d8047688f0c1")
        public static TagType HWTIMINGRESOURCE_ATTRIBUTE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("cc0a74ec-7c45-47b6-9b57-49a48bcf61c2")
        public static TagType HWTIMINGRESOURCE_ATTRIBUTE_FREQUENCY_TAGTYPE_ELT;

        @objid ("b6eafaf3-8cdc-4fc5-98ca-fc6bd3397bb6")
        private static Stereotype MDAASSOCDEP;

        @objid ("5490cdec-fcbc-4a12-9995-64dd27da21f1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cabfdab5-fe7c-4dfe-9beb-578b57ab1d42")
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
