/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.CommunicationEndPointLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwEndPoint_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ae8605fc-0ea2-4f61-a588-422a43b0b41d")
public class HwEndPointLifeline extends CommunicationEndPointLifeline {
    @objid ("1a55bdee-5422-4f97-bfcd-2fb9e40dc8d1")
    public static final String STEREOTYPE_NAME = "HwEndPoint_Lifeline";

    @objid ("cf3c2c57-4cf2-42bb-ae31-73be25229fc7")
    public static final String HWENDPOINT_LIFELINE_CONNECTEDTO_TAGTYPE = "HwEndPoint_Lifeline_connectedTo";

    @objid ("7f55d083-c312-4965-977e-dcf2d6728f7b")
    public static final String HWENDPOINT_LIFELINE_DESCRIPTION_TAGTYPE = "HwEndPoint_Lifeline_description";

    @objid ("e9419744-298b-40fe-9ffd-22857c167f00")
    public static final String HWENDPOINT_LIFELINE_FREQUENCY_TAGTYPE = "HwEndPoint_Lifeline_frequency";

    @objid ("ac0a9dad-e80d-4e51-832d-76403e453e16")
    public static final String HWENDPOINT_LIFELINE_OWNEDHW_TAGTYPE = "HwEndPoint_Lifeline_ownedHW";

    @objid ("dbba8cd6-433e-43f1-a9df-af3ad4c0df03")
    public static final String HWENDPOINT_LIFELINE_P_HW_SERVICES_TAGTYPE = "HwEndPoint_Lifeline_p_HW_Services";

    @objid ("ea05a365-18c6-4f4e-bfa1-0067b31ae80f")
    public static final String HWENDPOINT_LIFELINE_R_HW_SERVICES_TAGTYPE = "HwEndPoint_Lifeline_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwEndPoint_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("ad10fe4b-c977-4da5-9f7d-3a5b4a5369ef")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwEndPoint_Lifeline >> then instantiate a {@link HwEndPointLifeline} proxy.
     * 
     * @return a {@link HwEndPointLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("e234da1a-6c66-4885-a8fe-209314061fac")
    public static HwEndPointLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointLifeline.STEREOTYPE_NAME);
        return HwEndPointLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointLifeline} proxy from a {@link Lifeline} stereotyped << HwEndPoint_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwEndPointLifeline} proxy or <i>null</i>.
     */
    @objid ("80240571-986f-4817-945a-004c5111fb3a")
    public static HwEndPointLifeline instantiate(final Lifeline obj) {
        return HwEndPointLifeline.canInstantiate(obj) ? new HwEndPointLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwEndPointLifeline} proxy from a {@link Lifeline} stereotyped << HwEndPoint_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwEndPointLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("772a5b88-d839-4420-b323-04ce7d857c2f")
    public static HwEndPointLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwEndPointLifeline.canInstantiate(obj))
        	return new HwEndPointLifeline(obj);
        else
        	throw new IllegalArgumentException("HwEndPointLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2446ba05-0cc3-4f8e-95dc-b9367894bc00")
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
        HwEndPointLifeline other = (HwEndPointLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("0de393b9-93da-4167-9781-2f740d139953")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Lifeline_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("536e4aed-2778-4f01-933b-10a092c62f2e")
    public List<String> getHwEndPoint_Lifeline_connectedTo() {
        return this.elt.getTagValues(HwEndPointLifeline.MdaTypes.HWENDPOINT_LIFELINE_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a5cb0d1c-5691-4b4e-8723-80e8ea98f3f0")
    public String getHwEndPoint_Lifeline_description() {
        return this.elt.getTagValue(HwEndPointLifeline.MdaTypes.HWENDPOINT_LIFELINE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3288d664-8f25-477f-ab00-b6deb9f11654")
    public String getHwEndPoint_Lifeline_frequency() {
        return this.elt.getTagValue(HwEndPointLifeline.MdaTypes.HWENDPOINT_LIFELINE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Lifeline_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("7218a742-77ab-493b-87f4-f6dc32db4441")
    public List<String> getHwEndPoint_Lifeline_ownedHW() {
        return this.elt.getTagValues(HwEndPointLifeline.MdaTypes.HWENDPOINT_LIFELINE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Lifeline_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8629e79d-525e-47ee-a8a5-c6a851a888bf")
    public List<String> getHwEndPoint_Lifeline_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointLifeline.MdaTypes.HWENDPOINT_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Lifeline_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("74c684ce-76c2-4013-a85b-5980ea758755")
    public List<String> getHwEndPoint_Lifeline_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointLifeline.MdaTypes.HWENDPOINT_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("8ca48117-960d-4600-a50d-5a28f95e2daf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Lifeline_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("234e0e83-363b-4c48-9c40-c0c8d158e04e")
    public void setHwEndPoint_Lifeline_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointLifeline.MdaTypes.HWENDPOINT_LIFELINE_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fc7698d7-3228-4cde-ba50-01b7e68ace33")
    public void setHwEndPoint_Lifeline_description(final String value) {
        this.elt.putTagValue(HwEndPointLifeline.MdaTypes.HWENDPOINT_LIFELINE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("70b8b04b-bb82-45d9-b385-b2e1506a11a2")
    public void setHwEndPoint_Lifeline_frequency(final String value) {
        this.elt.putTagValue(HwEndPointLifeline.MdaTypes.HWENDPOINT_LIFELINE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Lifeline_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("79ffd6c0-fb20-46b7-82b4-7a717698888e")
    public void setHwEndPoint_Lifeline_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointLifeline.MdaTypes.HWENDPOINT_LIFELINE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Lifeline_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1385fdf2-7804-42a4-8272-607034a7413b")
    public void setHwEndPoint_Lifeline_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointLifeline.MdaTypes.HWENDPOINT_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Lifeline_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b17bc78-e0c8-4381-82fd-5be11d20c870")
    public void setHwEndPoint_Lifeline_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointLifeline.MdaTypes.HWENDPOINT_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("a4723235-53a9-4131-b629-e1f5ed114ab9")
    protected HwEndPointLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("d5aae369-1381-4c6e-a803-038011d973b0")
    public static final class MdaTypes {
        @objid ("d4941509-68bd-4cdd-b8a9-cc0f4c1688b8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d8cf5dc7-fbca-4379-89e6-0c5fe0e08548")
        public static TagType HWENDPOINT_LIFELINE_CONNECTEDTO_TAGTYPE_ELT;

        @objid ("09cf0c8a-41ba-4fb2-b35f-3aa992165470")
        public static TagType HWENDPOINT_LIFELINE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("f056532f-e49e-4cda-842c-d55f22fb1eb5")
        public static TagType HWENDPOINT_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("3af62757-af49-427d-8758-05d4a3a6724e")
        public static TagType HWENDPOINT_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("2fbcf904-ed0d-462c-82a3-76e178fd9325")
        public static TagType HWENDPOINT_LIFELINE_OWNEDHW_TAGTYPE_ELT;

        @objid ("812b726f-7e82-40f2-aa2f-27beb5c01e08")
        public static TagType HWENDPOINT_LIFELINE_FREQUENCY_TAGTYPE_ELT;

        @objid ("0a1f4f86-bc7a-48fa-867a-0dd6571808ad")
        private static Stereotype MDAASSOCDEP;

        @objid ("f46134e3-529c-4827-97c1-7587731a0f1b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5ec52292-d350-47a3-b73c-6657d2b7c131")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3d07fff1-10ac-11df-81d9-0014222a9f79");
            HWENDPOINT_LIFELINE_CONNECTEDTO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e874abb3-1726-11df-b92a-0014222a9f79");
            HWENDPOINT_LIFELINE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4de742f7-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4de742f8-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4de742f9-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_LIFELINE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4de742fa-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_LIFELINE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4de742fb-92a9-11e0-a69d-0027103f347c");
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
