/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.associationend.CommunicationEndPointAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwEndPoint_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("66514926-27ab-49ed-8aad-2c5fb0f4d279")
public class HwEndPointAssociationEnd extends CommunicationEndPointAssociationEnd {
    @objid ("84e6598e-ef47-4be9-907b-c863182848dc")
    public static final String STEREOTYPE_NAME = "HwEndPoint_AssociationEnd";

    @objid ("f9d798c2-a57d-4e4b-ae05-d0a92e573bbf")
    public static final String HWENDPOINT_ASSOCIATIONEND_CONNECTEDTO_TAGTYPE = "HwEndPoint_AssociationEnd_connectedTo";

    @objid ("d5afe55c-079c-4eaa-9fb4-76b3868a2a3a")
    public static final String HWENDPOINT_ASSOCIATIONEND_DESCRIPTION_TAGTYPE = "HwEndPoint_AssociationEnd_description";

    @objid ("49d9a3bd-0a1a-46d5-a476-31d73c8e4a23")
    public static final String HWENDPOINT_ASSOCIATIONEND_FREQUENCY_TAGTYPE = "HwEndPoint_AssociationEnd_frequency";

    @objid ("fb949623-fe86-476a-9be1-0ef74362c3e6")
    public static final String HWENDPOINT_ASSOCIATIONEND_OWNEDHW_TAGTYPE = "HwEndPoint_AssociationEnd_ownedHW";

    @objid ("e0b8441a-e8ad-4053-bf7f-250b8cf15f26")
    public static final String HWENDPOINT_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE = "HwEndPoint_AssociationEnd_p_HW_Services";

    @objid ("40e35894-5484-4368-9736-0e7e19d9677e")
    public static final String HWENDPOINT_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE = "HwEndPoint_AssociationEnd_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwEndPoint_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fdaff44f-e787-4659-b16b-411a03a5972a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwEndPoint_AssociationEnd >> then instantiate a {@link HwEndPointAssociationEnd} proxy.
     * 
     * @return a {@link HwEndPointAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("0b7ab5f6-f8fb-4ca1-816e-ffec1d5b61e5")
    public static HwEndPointAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointAssociationEnd.STEREOTYPE_NAME);
        return HwEndPointAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwEndPoint_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwEndPointAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("db1cfd4c-e0d8-4f0c-bcff-56d270f12302")
    public static HwEndPointAssociationEnd instantiate(final AssociationEnd obj) {
        return HwEndPointAssociationEnd.canInstantiate(obj) ? new HwEndPointAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwEndPointAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwEndPoint_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwEndPointAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("533c5c0c-8f8e-427f-be4e-52649e712f35")
    public static HwEndPointAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwEndPointAssociationEnd.canInstantiate(obj))
        	return new HwEndPointAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwEndPointAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("60b849ce-bffa-4a68-adcb-264b3253d230")
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
        HwEndPointAssociationEnd other = (HwEndPointAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("a2fcf480-078f-43bc-92c7-839595bc0571")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwEndPoint_AssociationEnd_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("09283033-1732-416d-8bc9-9a8cdf9b359c")
    public List<String> getHwEndPoint_AssociationEnd_connectedTo() {
        return this.elt.getTagValues(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a2c3f949-a4d3-4fb9-b197-655b25a0275b")
    public String getHwEndPoint_AssociationEnd_description() {
        return this.elt.getTagValue(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3efdbc42-d1d5-49c1-bd98-539a38de8e54")
    public String getHwEndPoint_AssociationEnd_frequency() {
        return this.elt.getTagValue(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_AssociationEnd_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3b289764-20ea-43ce-b79e-fe922199e806")
    public List<String> getHwEndPoint_AssociationEnd_ownedHW() {
        return this.elt.getTagValues(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_AssociationEnd_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e1681532-13a8-4842-ae88-d5a490077df0")
    public List<String> getHwEndPoint_AssociationEnd_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_AssociationEnd_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("764d6c4e-4229-40c9-8831-40836583dffa")
    public List<String> getHwEndPoint_AssociationEnd_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("29b125e3-ef59-4a60-b5cc-bb688bbd50f8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_AssociationEnd_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("59126882-9842-4c28-b2ab-576c7ac5deab")
    public void setHwEndPoint_AssociationEnd_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_AssociationEnd_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cfea7739-b315-4103-845d-1a19da5a19e8")
    public void setHwEndPoint_AssociationEnd_description(final String value) {
        this.elt.putTagValue(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_AssociationEnd_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ef915397-b213-4fca-840a-9653c47c9a45")
    public void setHwEndPoint_AssociationEnd_frequency(final String value) {
        this.elt.putTagValue(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_AssociationEnd_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9088d8a3-9126-4f7a-9824-e25f914f9843")
    public void setHwEndPoint_AssociationEnd_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_AssociationEnd_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("20a3e6d8-cba8-4b56-8019-85cc92a3fecf")
    public void setHwEndPoint_AssociationEnd_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_AssociationEnd_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("83654531-6ac4-48b4-80f7-721ba6239f8f")
    public void setHwEndPoint_AssociationEnd_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociationEnd.MdaTypes.HWENDPOINT_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("79a4c057-4134-4edb-aa99-766b8ff76b6e")
    protected HwEndPointAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("9b7a0c35-98cb-49ee-b311-c6f68927c683")
    public static final class MdaTypes {
        @objid ("25da465f-66c6-471f-8d8a-514ccb18f961")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c8d44084-09c1-40e6-a34b-d1451a2e62f6")
        public static TagType HWENDPOINT_ASSOCIATIONEND_CONNECTEDTO_TAGTYPE_ELT;

        @objid ("9c154e75-85d6-4b21-9bb8-5cc4c8453600")
        public static TagType HWENDPOINT_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT;

        @objid ("f72ba633-6c02-4fa6-bb79-8490be34d3a6")
        public static TagType HWENDPOINT_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("3ba187d1-4fc2-4559-b648-540292cb68af")
        public static TagType HWENDPOINT_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("fe581ae2-65dd-42c8-9ef2-156950386fa2")
        public static TagType HWENDPOINT_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT;

        @objid ("b1fa5507-21b1-407b-8c27-d653986a5eb0")
        public static TagType HWENDPOINT_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT;

        @objid ("44a39a98-2d12-4abc-981f-99296ba97c52")
        private static Stereotype MDAASSOCDEP;

        @objid ("08d04282-4b02-4f8d-9d13-66db9d0f495f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3b750d24-4252-425b-853b-8698539044c4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "010cf42e-0ccf-11df-8525-001302895b2b");
            HWENDPOINT_ASSOCIATIONEND_CONNECTEDTO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "010f5681-0ccf-11df-8525-001302895b2b");
            HWENDPOINT_ASSOCIATIONEND_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "49b6c443-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATIONEND_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "49b6eb54-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATIONEND_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "49b6eb55-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATIONEND_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "49b6eb56-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATIONEND_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "49b6eb57-92a9-11e0-a69d-0027103f347c");
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
