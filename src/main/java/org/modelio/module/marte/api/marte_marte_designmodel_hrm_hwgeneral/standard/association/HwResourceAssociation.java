/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.association;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.ResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("205c663f-2886-43d9-8697-d6b08c7d10a5")
public class HwResourceAssociation extends ResourceAssociation {
    @objid ("b852110a-b5f5-4e41-8a73-8c818d1f1539")
    public static final String STEREOTYPE_NAME = "HwResource_Association";

    @objid ("2915985c-d4c9-4ab8-ab15-842a21ea6552")
    public static final String HWRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE = "HwResource_Association_description";

    @objid ("c26cf775-92c5-4fba-bad6-350899faf4cf")
    public static final String HWRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE = "HwResource_Association_endPoints";

    @objid ("8ebb0f1e-ecc8-47ef-b8e4-95991706e7a6")
    public static final String HWRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE = "HwResource_Association_frequency";

    @objid ("7cfe56ac-e89c-4602-acc2-cd12495d2a9e")
    public static final String HWRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE = "HwResource_Association_ownedHW";

    @objid ("bca4d682-3d6f-4538-a1bc-5b2216d894b4")
    public static final String HWRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE = "HwResource_Association_p_HW_Services";

    @objid ("3a71f8ec-8d82-4401-8bc1-8fa587475eea")
    public static final String HWRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE = "HwResource_Association_r_HW_Services";

    /**
     * Tells whether a {@link HwResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("77ba2440-3bbd-4fda-b54f-35ebe3b7645e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwResource_Association >> then instantiate a {@link HwResourceAssociation} proxy.
     * 
     * @return a {@link HwResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("7ce614a8-cf2e-438b-8a44-963a3e550ba3")
    public static HwResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceAssociation.STEREOTYPE_NAME);
        return HwResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceAssociation} proxy from a {@link Association} stereotyped << HwResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("aae1b403-aba9-4754-8eaf-f347da33e886")
    public static HwResourceAssociation instantiate(final Association obj) {
        return HwResourceAssociation.canInstantiate(obj) ? new HwResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceAssociation} proxy from a {@link Association} stereotyped << HwResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4a767ffc-fbd7-4929-89e0-9235b0148630")
    public static HwResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwResourceAssociation.canInstantiate(obj))
        	return new HwResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("HwResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("12c69a6c-33c9-40e2-9f06-cfc69ea74b94")
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
        HwResourceAssociation other = (HwResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("8473c841-85d5-4536-99d8-a2634534663f")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwResource_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d922acd-3454-4e5a-af5f-7adf80a11078")
    public String getHwResource_Association_description() {
        return this.elt.getTagValue(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Association_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9ff5dfc7-e78c-41c8-b8d9-a750a2b1e8fa")
    public List<String> getHwResource_Association_endPoints() {
        return this.elt.getTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResource_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d1ad92c-ae4b-4e8d-b3e0-3815374e0dc8")
    public String getHwResource_Association_frequency() {
        return this.elt.getTagValue(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Association_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("38ff75da-faf1-4b23-915c-e27c7328e678")
    public List<String> getHwResource_Association_ownedHW() {
        return this.elt.getTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Association_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("a9cc1e94-4c35-4ef8-8f0a-e358fe3e3e32")
    public List<String> getHwResource_Association_p_HW_Services() {
        return this.elt.getTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Association_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("5a5ca398-ab28-4447-bd02-5a051fc9572a")
    public List<String> getHwResource_Association_r_HW_Services() {
        return this.elt.getTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("5fd88139-a4cc-4493-bf41-20cd7aa3486a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResource_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5a09cdc6-bfdf-41cd-b7d8-183180b5595d")
    public void setHwResource_Association_description(final String value) {
        this.elt.putTagValue(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Association_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("68b3548d-ab5f-4ba1-aa1c-871e724290d0")
    public void setHwResource_Association_endPoints(final List<String> values) {
        this.elt.putTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwResource_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("89b578b7-ec6a-450c-82c3-f443071ec78b")
    public void setHwResource_Association_frequency(final String value) {
        this.elt.putTagValue(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Association_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bf73eb5c-c31b-4445-b712-4972eca04ec8")
    public void setHwResource_Association_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Association_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("adb10a4a-ea08-489c-a585-a54146749467")
    public void setHwResource_Association_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Association_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c3da7dd9-45e5-49fb-96a8-0f32f9e91405")
    public void setHwResource_Association_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceAssociation.MdaTypes.HWRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("c772f761-6a31-4a31-aa7c-651c31c419c6")
    protected HwResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("5189b4a1-210b-458b-a0e8-ef90240f1909")
    public static final class MdaTypes {
        @objid ("3df3e2bd-fad1-4f3b-a905-a688d7a414f3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("413d3bd6-6c17-417c-9c89-96480ecbc17c")
        public static TagType HWRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT;

        @objid ("dc792213-2b6e-4b61-aeec-a70c6519172e")
        public static TagType HWRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("83874df5-492c-47a3-947b-12ce2b265f74")
        public static TagType HWRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("03f08e6d-b0e7-4d6f-be64-8a9ebaaccd66")
        public static TagType HWRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT;

        @objid ("13c36ff3-3a8e-4f07-9543-11c8db0b394c")
        public static TagType HWRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        @objid ("2a6cfbb5-bd93-48de-8e49-560cd442921d")
        public static TagType HWRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT;

        @objid ("290ec10d-de72-41fc-9199-b7c398b4a9c5")
        private static Stereotype MDAASSOCDEP;

        @objid ("372c4891-98f6-4369-9521-f937bc1a776e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b8f05189-0468-4f8d-b7fe-9fdf43006c2c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "495b5f8b-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "70448062-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "70448063-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "70448064-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7044805f-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "70448061-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_ASSOCIATION_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3186f94b-1709-11df-b92a-0014222a9f79");
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
