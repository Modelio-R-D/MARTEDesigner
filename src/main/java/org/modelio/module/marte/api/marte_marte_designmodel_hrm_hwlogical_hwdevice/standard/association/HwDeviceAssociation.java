/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.association;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.association.HwResourceAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwDevice_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("160b4396-e87b-4d2b-8693-76189fe46f58")
public class HwDeviceAssociation extends HwResourceAssociation {
    @objid ("33e0a7a9-4138-47c2-bae8-180e4c74b9b5")
    public static final String STEREOTYPE_NAME = "HwDevice_Association";

    @objid ("15076234-cbd9-481f-994d-f8d681c38f31")
    public static final String HWDEVICE_ASSOCIATION_MAINSCHEDULER_TAGTYPE = "HwDevice_Association_mainScheduler";

    @objid ("e7292152-9d11-4276-8597-25f678978737")
    public static final String HWDEVICE_ASSOCIATION_SPEEDFACTOR_TAGTYPE = "HwDevice_Association_speedFactor";

    /**
     * Tells whether a {@link HwDeviceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwDevice_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e56ce4ac-e6bb-4fb3-9a8f-2e632e120120")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwDevice_Association >> then instantiate a {@link HwDeviceAssociation} proxy.
     * 
     * @return a {@link HwDeviceAssociation} proxy on the created {@link Association}.
     */
    @objid ("6c293125-eae8-4a3f-9be8-01d294d43fc2")
    public static HwDeviceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceAssociation.STEREOTYPE_NAME);
        return HwDeviceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwDeviceAssociation} proxy from a {@link Association} stereotyped << HwDevice_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwDeviceAssociation} proxy or <i>null</i>.
     */
    @objid ("787054d7-f100-4cf3-ae59-aae288a2c7ff")
    public static HwDeviceAssociation instantiate(final Association obj) {
        return HwDeviceAssociation.canInstantiate(obj) ? new HwDeviceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDeviceAssociation} proxy from a {@link Association} stereotyped << HwDevice_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwDeviceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e61121db-4153-4d33-be50-2ef3487bc1e1")
    public static HwDeviceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwDeviceAssociation.canInstantiate(obj))
        	return new HwDeviceAssociation(obj);
        else
        	throw new IllegalArgumentException("HwDeviceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ba9eedae-4572-468f-a6da-55e6a9bba4b0")
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
        HwDeviceAssociation other = (HwDeviceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("17d4942d-d837-4a6f-9aa6-475866c69e47")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwDevice_Association_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ad178b0a-8e4f-48ac-8b09-466d8165eb36")
    public String getHwDevice_Association_mainScheduler() {
        return this.elt.getTagValue(HwDeviceAssociation.MdaTypes.HWDEVICE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDevice_Association_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4a504031-e033-40b4-8681-307690e15be7")
    public String getHwDevice_Association_speedFactor() {
        return this.elt.getTagValue(HwDeviceAssociation.MdaTypes.HWDEVICE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("ef1a143b-88e1-488d-8a78-b693f9db0c39")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDevice_Association_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eb5d2b19-4081-47bf-b689-0140d9c409c9")
    public void setHwDevice_Association_mainScheduler(final String value) {
        this.elt.putTagValue(HwDeviceAssociation.MdaTypes.HWDEVICE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDevice_Association_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("616c0bcf-ff11-4a92-980c-6dccec26135d")
    public void setHwDevice_Association_speedFactor(final String value) {
        this.elt.putTagValue(HwDeviceAssociation.MdaTypes.HWDEVICE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("24202a0d-cbe3-4a63-b6d2-ffe7d754eadb")
    protected HwDeviceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("67dfd781-06ff-4dd5-8238-a743d7b2b967")
    public static final class MdaTypes {
        @objid ("2db43c12-07b0-41af-88a8-cea08a91aa8b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d081277f-ea1b-49d8-94bb-46663f2e9c1c")
        public static TagType HWDEVICE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("af4c5e09-ef81-4436-9ca6-3dee4fcf74d3")
        public static TagType HWDEVICE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("d879e894-b24c-4a9e-90c7-ae0b0bb7641d")
        private static Stereotype MDAASSOCDEP;

        @objid ("66f4ffe9-8356-4e39-8c39-4a0750c9ef7b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a642d77a-4932-4e61-b2c3-8a0757d1a4ae")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cd4663bb-10b0-11df-81d9-0014222a9f79");
            HWDEVICE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3472b714-92ab-11e0-a69d-0027103f347c");
            HWDEVICE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3472b715-92ab-11e0-a69d-0027103f347c");
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
