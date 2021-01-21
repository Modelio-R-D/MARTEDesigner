/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.CommunicationEndPointAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwEndPoint_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9a0b8c8b-4af1-40a2-a8b3-b926cafed60c")
public class HwEndPointAssociation extends CommunicationEndPointAssociation {
    @objid ("3ca0ac5f-8e7c-4bbe-b433-e53e6c13dee8")
    public static final String STEREOTYPE_NAME = "HwEndPoint_Association";

    @objid ("ba21c8f8-a68f-4df6-b255-66e75fcb62bc")
    public static final String HWENDPOINT_ASSOCIATION_CONNECTEDTO_TAGTYPE = "HwEndPoint_Association_connectedTo";

    @objid ("469b1b73-8f73-4194-a6fc-8a0f43071a95")
    public static final String HWENDPOINT_ASSOCIATION_DESCRIPTION_TAGTYPE = "HwEndPoint_Association_description";

    @objid ("72b98366-8fd6-402c-b0ae-f8f02d82b6c4")
    public static final String HWENDPOINT_ASSOCIATION_FREQUENCY_TAGTYPE = "HwEndPoint_Association_frequency";

    @objid ("56360a5a-a4ce-4e6d-b9db-44c8fd245bf1")
    public static final String HWENDPOINT_ASSOCIATION_OWNEDHW_TAGTYPE = "HwEndPoint_Association_ownedHW";

    @objid ("bf56424b-9a7e-458f-a8c6-ce95c3086f9e")
    public static final String HWENDPOINT_ASSOCIATION_P_HW_SERVICES_TAGTYPE = "HwEndPoint_Association_p_HW_Services";

    @objid ("683942c2-2dcd-4237-a394-ba6ded5e17dc")
    public static final String HWENDPOINT_ASSOCIATION_R_HW_SERVICES_TAGTYPE = "HwEndPoint_Association_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwEndPoint_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1a24c3fc-40ae-4625-bdec-7cd4beacc406")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwEndPoint_Association >> then instantiate a {@link HwEndPointAssociation} proxy.
     * 
     * @return a {@link HwEndPointAssociation} proxy on the created {@link Association}.
     */
    @objid ("a2bb0ac1-1c7d-4577-aeb4-b94e183bf68b")
    public static HwEndPointAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointAssociation.STEREOTYPE_NAME);
        return HwEndPointAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointAssociation} proxy from a {@link Association} stereotyped << HwEndPoint_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwEndPointAssociation} proxy or <i>null</i>.
     */
    @objid ("6d5f6275-ea25-4441-bb4d-296775f217e8")
    public static HwEndPointAssociation instantiate(final Association obj) {
        return HwEndPointAssociation.canInstantiate(obj) ? new HwEndPointAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwEndPointAssociation} proxy from a {@link Association} stereotyped << HwEndPoint_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwEndPointAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c6eeacde-cef7-4a92-b831-47a7a4d61423")
    public static HwEndPointAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwEndPointAssociation.canInstantiate(obj))
        	return new HwEndPointAssociation(obj);
        else
        	throw new IllegalArgumentException("HwEndPointAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3df5535e-89f8-4886-9681-a5a1b749d1d3")
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
        HwEndPointAssociation other = (HwEndPointAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("b350d764-6ee2-4fd7-8ee4-18e38bb40c7e")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Association_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b9c75342-8cfe-4fb0-a20a-78b86c9e5c24")
    public List<String> getHwEndPoint_Association_connectedTo() {
        return this.elt.getTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a4e469db-badf-428f-885b-ad883b7d3653")
    public String getHwEndPoint_Association_description() {
        return this.elt.getTagValue(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e858fa07-0020-45b2-b3fa-4607b11c2a66")
    public String getHwEndPoint_Association_frequency() {
        return this.elt.getTagValue(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Association_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("f938b4b6-b37c-4812-ad94-00e5101b9256")
    public List<String> getHwEndPoint_Association_ownedHW() {
        return this.elt.getTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Association_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("34f98f42-e835-430c-a9d1-9006bfb44c39")
    public List<String> getHwEndPoint_Association_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Association_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("28d4fff3-20c9-41db-bf58-1f64ed392ecd")
    public List<String> getHwEndPoint_Association_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("9379fd20-f2f8-44d2-b3fa-ff0a951ea50f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Association_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b60d750-a8dc-4fda-a305-845490e37b31")
    public void setHwEndPoint_Association_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("94c65423-8d9c-4bd7-8f1c-bf8201cdda43")
    public void setHwEndPoint_Association_description(final String value) {
        this.elt.putTagValue(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a056e797-7302-4c35-82fa-206840d41e51")
    public void setHwEndPoint_Association_frequency(final String value) {
        this.elt.putTagValue(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Association_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ce90095b-30db-4faf-9988-ab991f0589ba")
    public void setHwEndPoint_Association_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Association_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6304e8c8-88be-4085-b7a3-d44b341de0f4")
    public void setHwEndPoint_Association_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Association_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69f1e6e9-83bf-48d5-9c93-198e24d50675")
    public void setHwEndPoint_Association_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("eb076238-24c0-42d1-a20b-522d2eaaa750")
    protected HwEndPointAssociation(final Association elt) {
        super(elt);
    }

    @objid ("702ee6c3-3ed2-4b7e-bbb9-5af441477f3d")
    public static final class MdaTypes {
        @objid ("c971bf78-bc0c-4b81-b3b9-0e04be09aa78")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7868acff-f5f8-4ce0-945b-254e64936c65")
        public static TagType HWENDPOINT_ASSOCIATION_CONNECTEDTO_TAGTYPE_ELT;

        @objid ("d3e8d1f9-176f-423f-9c6d-ca321945a587")
        public static TagType HWENDPOINT_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT;

        @objid ("614d55d8-53db-40e5-b420-b36e72c58e03")
        public static TagType HWENDPOINT_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("24c874f6-f388-457b-865d-a4d15ad2fadc")
        public static TagType HWENDPOINT_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("3230e77d-1e53-43f0-9844-14825f6b7344")
        public static TagType HWENDPOINT_ASSOCIATION_OWNEDHW_TAGTYPE_ELT;

        @objid ("b2d8b3ab-2056-403d-9554-b1b55efe80df")
        public static TagType HWENDPOINT_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        @objid ("25863fa8-aa9e-4e96-8e5d-468a5438a60c")
        private static Stereotype MDAASSOCDEP;

        @objid ("f0c473f6-aaa0-468e-907c-f11dde3ed555")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d5fb7ede-9b05-41d0-bed1-0e352e82c0f0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3cdf782a-10ac-11df-81d9-0014222a9f79");
            HWENDPOINT_ASSOCIATION_CONNECTEDTO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e64926e0-1726-11df-b92a-0014222a9f79");
            HWENDPOINT_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48c24be1-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48c24be2-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48c24be3-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATION_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48c24be4-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATION_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48c24be5-92a9-11e0-a69d-0027103f347c");
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
