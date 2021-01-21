/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.link.ComputingResourceLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwComputingResource_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9f3fc654-0359-49b4-bf57-c1513b5dbfaf")
public class HwComputingResourceLink extends ComputingResourceLink {
    @objid ("9faed5b8-286c-47b5-bf3b-97012b9e1a55")
    public static final String STEREOTYPE_NAME = "HwComputingResource_Link";

    @objid ("d2027fbe-6160-4899-be5c-8d8e3d0010a6")
    public static final String HWCOMPUTINGRESOURCE_LINK_DESCRIPTION_TAGTYPE = "HwComputingResource_Link_description";

    @objid ("594ca196-2f08-4098-b8b6-206e737ec307")
    public static final String HWCOMPUTINGRESOURCE_LINK_ENDPOINTS_TAGTYPE = "HwComputingResource_Link_endPoints";

    @objid ("352089bf-a0f3-4205-82c3-dff1ba3bf184")
    public static final String HWCOMPUTINGRESOURCE_LINK_FREQUENCY_TAGTYPE = "HwComputingResource_Link_frequency";

    @objid ("dd0eebee-77cb-4840-af98-a8d4d956fbfd")
    public static final String HWCOMPUTINGRESOURCE_LINK_OP_FREQUENCIES_TAGTYPE = "HwComputingResource_Link_op_Frequencies";

    @objid ("3cb7e1d5-8cd8-42cb-a9d1-21888ab6e39f")
    public static final String HWCOMPUTINGRESOURCE_LINK_OWNEDHW_TAGTYPE = "HwComputingResource_Link_ownedHW";

    @objid ("32038353-8fe6-4114-b7f5-c87a849d2fcf")
    public static final String HWCOMPUTINGRESOURCE_LINK_P_HW_SERVICES_TAGTYPE = "HwComputingResource_Link_p_HW_Services";

    @objid ("d14aa788-abf6-4382-bf85-7e396ce28308")
    public static final String HWCOMPUTINGRESOURCE_LINK_R_HW_SERVICES_TAGTYPE = "HwComputingResource_Link_r_HW_Services";

    /**
     * Tells whether a {@link HwComputingResourceLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwComputingResource_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6fa530ed-cb00-479c-84f5-5d94469ec0b7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwComputingResource_Link >> then instantiate a {@link HwComputingResourceLink} proxy.
     * 
     * @return a {@link HwComputingResourceLink} proxy on the created {@link Link}.
     */
    @objid ("2fe56cc7-ac91-44d3-97db-723dacbebe31")
    public static HwComputingResourceLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwComputingResourceLink.STEREOTYPE_NAME);
        return HwComputingResourceLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceLink} proxy from a {@link Link} stereotyped << HwComputingResource_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwComputingResourceLink} proxy or <i>null</i>.
     */
    @objid ("1ddabf79-cfdc-4ad6-ab6d-a758a7f0d3b1")
    public static HwComputingResourceLink instantiate(final Link obj) {
        return HwComputingResourceLink.canInstantiate(obj) ? new HwComputingResourceLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwComputingResourceLink} proxy from a {@link Link} stereotyped << HwComputingResource_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwComputingResourceLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("008abdc5-96ca-46d7-8d4d-6e21271dcebd")
    public static HwComputingResourceLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwComputingResourceLink.canInstantiate(obj))
        	return new HwComputingResourceLink(obj);
        else
        	throw new IllegalArgumentException("HwComputingResourceLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d6656054-c11d-4177-bda1-588b7e39e831")
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
        HwComputingResourceLink other = (HwComputingResourceLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("cea62ba9-f1dd-4f11-994d-5d0081ee41b9")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwComputingResource_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6aa64f58-1565-4a9e-9ccc-d3b78d2becd0")
    public String getHwComputingResource_Link_description() {
        return this.elt.getTagValue(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Link_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("afe4a5ea-5116-4bce-bb61-51a1811b8803")
    public List<String> getHwComputingResource_Link_endPoints() {
        return this.elt.getTagValues(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e10d3f44-9f84-4fd7-9549-c99210a9628a")
    public String getHwComputingResource_Link_frequency() {
        return this.elt.getTagValue(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwComputingResource_Link_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3957dd45-37f9-48f1-b523-8de98d78b48a")
    public String getHwComputingResource_Link_op_Frequencies() {
        return this.elt.getTagValue(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_OP_FREQUENCIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Link_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("fd80ea9c-30c6-404b-90d1-234ef4a6990b")
    public List<String> getHwComputingResource_Link_ownedHW() {
        return this.elt.getTagValues(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Link_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5a4a3167-837d-4d7e-a4c7-a97f6bffe662")
    public List<String> getHwComputingResource_Link_p_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwComputingResource_Link_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("064add7d-e97c-4189-be8b-647e2cef55da")
    public List<String> getHwComputingResource_Link_r_HW_Services() {
        return this.elt.getTagValues(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("f7c0130c-583a-47b6-88dd-23470cf8736e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwComputingResource_Link_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f51e1f16-d840-449f-bb64-9c6b1b5e8f95")
    public void setHwComputingResource_Link_description(final String value) {
        this.elt.putTagValue(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Link_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("975efe4f-df38-4aa1-94d1-b71dbed0aad8")
    public void setHwComputingResource_Link_endPoints(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwComputingResource_Link_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("91d3c2a9-1841-47ab-84f5-6b8c955157e7")
    public void setHwComputingResource_Link_frequency(final String value) {
        this.elt.putTagValue(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwComputingResource_Link_op_Frequencies'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d9328a7-9695-4a35-9aa6-88f5d49084c0")
    public void setHwComputingResource_Link_op_Frequencies(final String value) {
        this.elt.putTagValue(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_OP_FREQUENCIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Link_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ba90d3b5-f598-4342-9ee9-4fc7eaedf73a")
    public void setHwComputingResource_Link_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Link_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cdb939ad-5658-4088-bff7-11e839200e98")
    public void setHwComputingResource_Link_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwComputingResource_Link_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("51ba49d8-51e3-4259-8702-5a1c635c1b81")
    public void setHwComputingResource_Link_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwComputingResourceLink.MdaTypes.HWCOMPUTINGRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("10996132-4cea-4c91-86d9-2c5809f52cfb")
    protected HwComputingResourceLink(final Link elt) {
        super(elt);
    }

    @objid ("4adf41ad-a236-4668-9378-fe6613bb3ee0")
    public static final class MdaTypes {
        @objid ("ba821e4f-d1e4-44a9-b863-0b0d907c7dcb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a40865de-3b89-42a1-b61c-a4a09495af0f")
        public static TagType HWCOMPUTINGRESOURCE_LINK_OP_FREQUENCIES_TAGTYPE_ELT;

        @objid ("ad8608fb-1b90-4de9-82de-433bcef6156a")
        public static TagType HWCOMPUTINGRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT;

        @objid ("9078a5d1-ebc9-43e5-b1e9-0555dc8dda87")
        public static TagType HWCOMPUTINGRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("a60042da-9c78-4b7f-8907-f547a8e11297")
        public static TagType HWCOMPUTINGRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("949844b8-edb3-4a5b-9a13-b27d58a17efd")
        public static TagType HWCOMPUTINGRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT;

        @objid ("1f7b2da1-e388-44bf-bec1-c424f19875be")
        public static TagType HWCOMPUTINGRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT;

        @objid ("e5bc19e0-8e85-4569-8e3e-4e274a9505f9")
        public static TagType HWCOMPUTINGRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT;

        @objid ("5262425a-e8ba-4dbe-804d-7dbb32bd5134")
        private static Stereotype MDAASSOCDEP;

        @objid ("e89e759d-6e15-4c94-a58c-438f7b3586fa")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2627c5b3-c8d9-4de3-89b5-3a2c9a1e231b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00d61ed5-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_LINK_OP_FREQUENCIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00e46cc1-0ccf-11df-8525-001302895b2b");
            HWCOMPUTINGRESOURCE_LINK_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4b0462dc-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_LINK_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4b0462dd-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_LINK_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4b0462de-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_LINK_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4b0462df-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_LINK_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4b0462e0-1623-11df-b9be-0014222a9f79");
            HWCOMPUTINGRESOURCE_LINK_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4b0462e1-1623-11df-b9be-0014222a9f79");
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
