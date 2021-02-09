/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
public class HwStorageManagerLifeline extends StorageResourceLifeline {
    public static final String STEREOTYPE_NAME = "HwStorageManager_Lifeline";

    public static final String HWSTORAGEMANAGER_LIFELINE_DESCRIPTION_TAGTYPE = "HwStorageManager_Lifeline_description";

    public static final String HWSTORAGEMANAGER_LIFELINE_ENDPOINTS_TAGTYPE = "HwStorageManager_Lifeline_endPoints";

    public static final String HWSTORAGEMANAGER_LIFELINE_FREQUENCY_TAGTYPE = "HwStorageManager_Lifeline_frequency";

    public static final String HWSTORAGEMANAGER_LIFELINE_MANAGEDMEMORIES_TAGTYPE = "HwStorageManager_Lifeline_managedMemories";

    public static final String HWSTORAGEMANAGER_LIFELINE_OWNEDHW_TAGTYPE = "HwStorageManager_Lifeline_ownedHW";

    public static final String HWSTORAGEMANAGER_LIFELINE_P_HW_SERVICES_TAGTYPE = "HwStorageManager_Lifeline_p_HW_Services";

    public static final String HWSTORAGEMANAGER_LIFELINE_R_HW_SERVICES_TAGTYPE = "HwStorageManager_Lifeline_r_HW_Services";

    /**
     * Tells whether a {@link HwStorageManagerLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwStorageManager_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwStorageManager_Lifeline >> then instantiate a {@link HwStorageManagerLifeline} proxy.
     * 
     * @return a {@link HwStorageManagerLifeline} proxy on the created {@link Lifeline}.
     */
    public static HwStorageManagerLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwStorageManagerLifeline.STEREOTYPE_NAME);
        return HwStorageManagerLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwStorageManagerLifeline} proxy from a {@link Lifeline} stereotyped << HwStorageManager_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwStorageManagerLifeline} proxy or <i>null</i>.
     */
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
    public static HwStorageManagerLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwStorageManagerLifeline.canInstantiate(obj))
        	return new HwStorageManagerLifeline(obj);
        else
        	throw new IllegalArgumentException("HwStorageManagerLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwStorageManager_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwStorageManager_Lifeline_description() {
        return this.elt.getTagValue(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Lifeline_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_Lifeline_endPoints() {
        return this.elt.getTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwStorageManager_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwStorageManager_Lifeline_frequency() {
        return this.elt.getTagValue(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Lifeline_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_Lifeline_managedMemories() {
        return this.elt.getTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Lifeline_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_Lifeline_ownedHW() {
        return this.elt.getTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Lifeline_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_Lifeline_p_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwStorageManager_Lifeline_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwStorageManager_Lifeline_r_HW_Services() {
        return this.elt.getTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwStorageManager_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Lifeline_description(final String value) {
        this.elt.putTagValue(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Lifeline_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Lifeline_endPoints(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwStorageManager_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Lifeline_frequency(final String value) {
        this.elt.putTagValue(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Lifeline_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Lifeline_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Lifeline_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Lifeline_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Lifeline_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Lifeline_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwStorageManager_Lifeline_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwStorageManager_Lifeline_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwStorageManagerLifeline.MdaTypes.HWSTORAGEMANAGER_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwStorageManagerLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_LIFELINE_MANAGEDMEMORIES_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_LIFELINE_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_LIFELINE_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_LIFELINE_FREQUENCY_TAGTYPE_ELT;

        public static TagType HWSTORAGEMANAGER_LIFELINE_ENDPOINTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
