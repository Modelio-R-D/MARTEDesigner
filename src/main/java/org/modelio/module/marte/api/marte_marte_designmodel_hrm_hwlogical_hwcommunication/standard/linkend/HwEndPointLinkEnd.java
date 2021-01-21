/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.linkend;

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
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.linkend.CommunicationEndPointLinkEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link LinkEnd} with << HwEndPoint_LinkEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5a095d76-6b4f-41d5-9982-99c86c401290")
public class HwEndPointLinkEnd extends CommunicationEndPointLinkEnd {
    @objid ("fc555142-35a6-4176-9f1c-57a52b079344")
    public static final String STEREOTYPE_NAME = "HwEndPoint_LinkEnd";

    @objid ("7d090206-7322-4a50-84de-e03a8048fecd")
    public static final String HWENDPOINT_LINKEND_CONNECTEDTO_TAGTYPE = "HwEndPoint_LinkEnd_connectedTo";

    @objid ("aaedc0bb-73c3-4fc2-b954-906a9a49de8c")
    public static final String HWENDPOINT_LINKEND_DESCRIPTION_TAGTYPE = "HwEndPoint_LinkEnd_description";

    @objid ("0bf51d47-7ef4-4aca-a231-e73a39c8caf6")
    public static final String HWENDPOINT_LINKEND_FREQUENCY_TAGTYPE = "HwEndPoint_LinkEnd_frequency";

    @objid ("36a1ced2-7389-471b-a416-5df385a28e5d")
    public static final String HWENDPOINT_LINKEND_OWNEDHW_TAGTYPE = "HwEndPoint_LinkEnd_ownedHW";

    @objid ("56d71fa2-f8b3-4317-98a7-5ece99b55fb3")
    public static final String HWENDPOINT_LINKEND_P_HW_SERVICES_TAGTYPE = "HwEndPoint_LinkEnd_p_HW_Services";

    @objid ("11628f07-7697-4e16-96f6-72db5e4eb16e")
    public static final String HWENDPOINT_LINKEND_R_HW_SERVICES_TAGTYPE = "HwEndPoint_LinkEnd_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointLinkEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link LinkEnd} stereotyped << HwEndPoint_LinkEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a91ae839-929a-4a65-9993-09c02a15d171")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof LinkEnd) && ((LinkEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointLinkEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link LinkEnd} stereotyped << HwEndPoint_LinkEnd >> then instantiate a {@link HwEndPointLinkEnd} proxy.
     * 
     * @return a {@link HwEndPointLinkEnd} proxy on the created {@link LinkEnd}.
     */
    @objid ("33ebfe51-95ff-42ef-abb9-0b5deac3ba1f")
    public static HwEndPointLinkEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("LinkEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointLinkEnd.STEREOTYPE_NAME);
        return HwEndPointLinkEnd.instantiate((LinkEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointLinkEnd} proxy from a {@link LinkEnd} stereotyped << HwEndPoint_LinkEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a LinkEnd
     * @return a {@link HwEndPointLinkEnd} proxy or <i>null</i>.
     */
    @objid ("ba28d5ca-a5c1-4145-8efa-d5d6fb077de5")
    public static HwEndPointLinkEnd instantiate(final LinkEnd obj) {
        return HwEndPointLinkEnd.canInstantiate(obj) ? new HwEndPointLinkEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwEndPointLinkEnd} proxy from a {@link LinkEnd} stereotyped << HwEndPoint_LinkEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link LinkEnd}
     * @return a {@link HwEndPointLinkEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c78e41ed-f9ba-4d9d-9172-9e741ee90575")
    public static HwEndPointLinkEnd safeInstantiate(final LinkEnd obj) throws IllegalArgumentException {
        if (HwEndPointLinkEnd.canInstantiate(obj))
        	return new HwEndPointLinkEnd(obj);
        else
        	throw new IllegalArgumentException("HwEndPointLinkEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("05c7c328-2c2b-4342-84d4-ac8254a80ff4")
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
        HwEndPointLinkEnd other = (HwEndPointLinkEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link LinkEnd}. 
     * @return the LinkEnd represented by this proxy, never null.
     */
    @objid ("5117834d-b6b7-4d1c-813f-8c40e8460981")
    @Override
    public LinkEnd getElement() {
        return (LinkEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwEndPoint_LinkEnd_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3f0b4d12-7982-4074-846a-bf2f33481b02")
    public List<String> getHwEndPoint_LinkEnd_connectedTo() {
        return this.elt.getTagValues(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_LinkEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1025ac10-5481-440b-80e5-ce34908ce8f4")
    public String getHwEndPoint_LinkEnd_description() {
        return this.elt.getTagValue(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_LinkEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4bf0964e-6a94-453f-995f-04b4db66bf1c")
    public String getHwEndPoint_LinkEnd_frequency() {
        return this.elt.getTagValue(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_LinkEnd_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("22ecfa56-d3e1-4c26-9c91-8a5b0ec0065d")
    public List<String> getHwEndPoint_LinkEnd_ownedHW() {
        return this.elt.getTagValues(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_LinkEnd_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("ae5bb3d7-d46a-4ba3-bee9-47d52e600787")
    public List<String> getHwEndPoint_LinkEnd_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_LinkEnd_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("54d63e6f-0455-4fe0-a1e8-64b63ef632f7")
    public List<String> getHwEndPoint_LinkEnd_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("2790c7fb-4eda-4e49-8006-fc9254881d6e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_LinkEnd_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("344be0e5-8513-4890-aefb-ce5949c49b89")
    public void setHwEndPoint_LinkEnd_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_LinkEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("079a0df8-50de-469c-bc1f-d2a0a2a24bce")
    public void setHwEndPoint_LinkEnd_description(final String value) {
        this.elt.putTagValue(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_LinkEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("edf5837f-0780-41af-807c-2b3522face8f")
    public void setHwEndPoint_LinkEnd_frequency(final String value) {
        this.elt.putTagValue(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_LinkEnd_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b3fa3558-babd-4a67-be4e-7a87a298fef8")
    public void setHwEndPoint_LinkEnd_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_LinkEnd_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cd728bf1-bd4f-4d72-ac0f-351692686805")
    public void setHwEndPoint_LinkEnd_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_LinkEnd_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8fed8c55-b721-49d6-b58d-46841111ff38")
    public void setHwEndPoint_LinkEnd_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointLinkEnd.MdaTypes.HWENDPOINT_LINKEND_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("64f1d36b-c484-4295-9d4b-96ca2f863702")
    protected HwEndPointLinkEnd(final LinkEnd elt) {
        super(elt);
    }

    @objid ("42cd4cbb-7b0b-4e9e-9f7e-f938749835c9")
    public static final class MdaTypes {
        @objid ("f00244b2-ab6e-4d7a-b245-216c66aefd46")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a69f4d9e-aeec-4fad-ad3b-e366025c8650")
        public static TagType HWENDPOINT_LINKEND_CONNECTEDTO_TAGTYPE_ELT;

        @objid ("16708749-c886-48a5-a67b-9dd0f4ea31d3")
        public static TagType HWENDPOINT_LINKEND_DESCRIPTION_TAGTYPE_ELT;

        @objid ("a4698695-a441-43d8-8d00-dfbaa770e606")
        public static TagType HWENDPOINT_LINKEND_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("9307e0c3-aa4d-41f9-8af7-61f8043a8ad6")
        public static TagType HWENDPOINT_LINKEND_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("8d3e0e62-1aa5-44e8-81e9-cc60757f8dfc")
        public static TagType HWENDPOINT_LINKEND_OWNEDHW_TAGTYPE_ELT;

        @objid ("95c075f0-8204-4c79-9dfb-966587d2fe24")
        public static TagType HWENDPOINT_LINKEND_FREQUENCY_TAGTYPE_ELT;

        @objid ("e309fc68-07d5-478d-9841-f722ec4cac6c")
        private static Stereotype MDAASSOCDEP;

        @objid ("bd30e246-3557-448b-aec3-83a85501e1e1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e5673111-ea1d-48f9-870d-3cfbf3cdd5c4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5e0bd798-32a9-11df-9294-001302895b2b");
            HWENDPOINT_LINKEND_CONNECTEDTO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5e0bd799-32a9-11df-9294-001302895b2b");
            HWENDPOINT_LINKEND_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4f631740-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_LINKEND_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4f631741-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_LINKEND_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4f631742-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_LINKEND_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4f633e51-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_LINKEND_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4f633e52-92a9-11e0-a69d-0027103f347c");
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
