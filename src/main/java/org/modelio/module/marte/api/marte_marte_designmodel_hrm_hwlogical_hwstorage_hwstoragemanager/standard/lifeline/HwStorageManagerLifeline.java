/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.lifeline;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.StorageResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwStorageManager_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1a483980-1686-4159-9c15-cddea48fd385")
public class HwStorageManagerLifeline extends StorageResourceLifeline {
    @objid ("1e30cc16-845b-47c5-8085-6ce6467568cf")
    public static final String STEREOTYPE_NAME = "HwStorageManager_Lifeline";

    @objid ("cbf9da9a-ba31-4a11-8741-6504b6702007")
    public static final String HWSTORAGEMANAGER_LIFELINE_DESCRIPTION_TAGTYPE = "HwStorageManager_Lifeline_description";

    @objid ("d0252930-9203-4f21-9079-0f3c801034a1")
    public static final String HWSTORAGEMANAGER_LIFELINE_ENDPOINTS_TAGTYPE = "HwStorageManager_Lifeline_endPoints";

    @objid ("bf508626-3c4a-47d5-84cf-2ec9bc481991")
    public static final String HWSTORAGEMANAGER_LIFELINE_FREQUENCY_TAGTYPE = "HwStorageManager_Lifeline_frequency";

    @objid ("cabebcb2-42d3-432b-b2e3-7068e6f792e8")
    public static final String HWSTORAGEMANAGER_LIFELINE_MANAGEDMEMORIES_TAGTYPE = "HwStorageManager_Lifeline_managedMemories";

    @objid ("709e9c12-5cc4-49ca-9b33-c66138f9128a")
    public static final String HWSTORAGEMANAGER_LIFELINE_OWNEDHW_TAGTYPE = "HwStorageManager_Lifeline_ownedHW";

    @objid ("1f5067c7-8a33-4cec-be90-25b077802f86")
    public static final String HWSTORAGEMANAGER_LIFELINE_P_HW_SERVICES_TAGTYPE = "HwStorageManager_Lifeline_p_HW_Services";

    @objid ("df5c7c4c-456c-46f8-9c06-b28ed3b9a2a2")
    public static final String HWSTORAGEMANAGER_LIFELINE_R_HW_SERVICES_TAGTYPE = "HwStorageManager_Lifeline_r_HW_Services";

    /**
     * Tells whether a {@link HwStorageManagerLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwStorageManager_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("03c6dd0d-96fb-4e94-9b87-5fd3a3ac107d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwStorageManager_Lifeline >> then instantiate a {@link HwStorageManagerLifeline} proxy.
     * 
     * @return a {@link HwStorageManagerLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("50eb2f68-cb55-4146-afaa-19b43b5f69f5")
    public static HwStorageManagerLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerLifeline.STEREOTYPE_NAME);
        return HwStorageManagerLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerLifeline} proxy from a {@link Lifeline} stereotyped << HwStorageManager_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwStorageManagerLifeline} proxy or <i>null</i>.
     */
    @objid ("d1272852-f1b1-40e7-b65b-48fa32848bfb")
    public static HwStorageManagerLifeline instantiate(final Lifeline obj) {
        return HwStorageManagerLifeline.canInstantiate(obj) ? new HwStorageManagerLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerLifeline} proxy from a {@link Lifeline} stereotyped << HwStorageManager_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwStorageManagerLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("05959b0c-ec39-4e38-8628-b3c6ab6a8d09")
    public static HwStorageManagerLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwStorageManagerLifeline.canInstantiate(obj))
        	return new HwStorageManagerLifeline(obj);
        else
        	throw new IllegalArgumentException("HwStorageManagerLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("61d5656a-2937-4034-bda4-4190f7d3d41d")
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
        HwStorageManagerLifeline other = (HwStorageManagerLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("50ceaea5-b6ce-4bb9-8b23-b1467de6fda8")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwStorageManager_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b62579f-ff9f-441a-9349-c75f5d7e9368")
    public String getHwStorageManager_Lifeline_description() {
        return this.elt.getTagValue(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Lifeline_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("93792ea2-5789-4335-8e5f-832491e69e32")
    public List<String> getHwStorageManager_Lifeline_endPoints() {
        return this.elt.getTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwStorageManager_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7ccdc442-c273-4c9b-82d0-e3c58fa6ec1a")
    public String getHwStorageManager_Lifeline_frequency() {
        return this.elt.getTagValue(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Lifeline_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cfa45502-4418-4554-88ca-d9ca1e998cb2")
    public List<String> getHwStorageManager_Lifeline_managedMemories() {
        return this.elt.getTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Lifeline_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6ab6f293-6b11-4cd6-ae41-ee0956917acc")
    public List<String> getHwStorageManager_Lifeline_ownedHW() {
        return this.elt.getTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Lifeline_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("411946e6-19cd-4cf1-9e4d-a1c3a8062fb2")
    public List<String> getHwStorageManager_Lifeline_p_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Lifeline_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("4e035887-1af2-40b6-a19e-473ec8548b53")
    public List<String> getHwStorageManager_Lifeline_r_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("1baafd1d-8ea5-46d0-958a-103e6c472731")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwStorageManager_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1ae3368b-055f-4a80-b286-70cf52bffaf6")
    public void setHwStorageManager_Lifeline_description(final String value) {
        this.elt.putTagValue(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Lifeline_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("40332fa3-61bd-4a55-87c3-48cd8124fb2a")
    public void setHwStorageManager_Lifeline_endPoints(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwStorageManager_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4c084642-3c65-429b-a59d-bbd03157fbf9")
    public void setHwStorageManager_Lifeline_frequency(final String value) {
        this.elt.putTagValue(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Lifeline_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("39693018-4265-42d2-b4cb-132a2fcfd990")
    public void setHwStorageManager_Lifeline_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Lifeline_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5dd646c5-4c4d-4642-8b69-b428f4a06d70")
    public void setHwStorageManager_Lifeline_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Lifeline_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ca7becef-5595-4351-86cb-a28a2dc7a28b")
    public void setHwStorageManager_Lifeline_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Lifeline_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e76ac4b6-2586-4b90-9d8a-0975b44d3e57")
    public void setHwStorageManager_Lifeline_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("72a0a7e6-31ff-4a9a-b43b-6d4287b20e82")
    protected HwStorageManagerLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("bc50e0ea-9eea-48eb-80c6-966d23a3a253")
    public static final class MdaTypes {
        @objid ("6e6acb41-776e-4b58-a9f8-dd2a3ffe8a78")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c81433be-d8c8-4c11-a817-91045d2e4e64")
        public static TagType HWSTORAGEMANAGER_LIFELINE_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("2335b2be-3f2e-40fb-b728-d225390edd63")
        public static TagType HWSTORAGEMANAGER_LIFELINE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("1a13f375-ed02-49f7-9f03-04ede09fcfc4")
        public static TagType HWSTORAGEMANAGER_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("2af4b016-cedb-453e-95cb-5640bba4d851")
        public static TagType HWSTORAGEMANAGER_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("124e68fb-3960-4c9e-b4d8-09e53795dfd0")
        public static TagType HWSTORAGEMANAGER_LIFELINE_OWNEDHW_TAGTYPE_ELT;

        @objid ("80aba6fe-1979-41f5-b4ad-ea36f170667e")
        public static TagType HWSTORAGEMANAGER_LIFELINE_FREQUENCY_TAGTYPE_ELT;

        @objid ("0cb955de-c2c3-49e9-8d59-6afba6c7113b")
        public static TagType HWSTORAGEMANAGER_LIFELINE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("14854e46-3709-4239-80a5-df628d68f28d")
        private static Stereotype MDAASSOCDEP;

        @objid ("f92b68e7-2fa2-42cb-a4be-3bd8bb5eba0c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f183b709-bce8-43a2-bae2-bcd3301b28ed")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1f71591c-10b3-11df-81d9-0014222a9f79");
            HWSTORAGEMANAGER_LIFELINE_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f71591d-10b3-11df-81d9-0014222a9f79");
            HWSTORAGEMANAGER_LIFELINE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b4c42768-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b4c42769-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b4c4276a-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_LIFELINE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b4c4276b-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_LIFELINE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b4c4276c-162f-11df-b9be-0014222a9f79");
            HWSTORAGEMANAGER_LIFELINE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48ce6069-1710-11df-b92a-0014222a9f79");
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
