/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class HwDeviceAssociation extends HwResourceAssociation {
    public static final String STEREOTYPE_NAME = "HwDevice_Association";

    public static final String HWDEVICE_ASSOCIATION_MAINSCHEDULER_TAGTYPE = "HwDevice_Association_mainScheduler";

    public static final String HWDEVICE_ASSOCIATION_SPEEDFACTOR_TAGTYPE = "HwDevice_Association_speedFactor";

    /**
     * Tells whether a {@link HwDeviceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwDevice_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwDevice_Association >> then instantiate a {@link HwDeviceAssociation} proxy.
     * 
     * @return a {@link HwDeviceAssociation} proxy on the created {@link Association}.
     */
    public static HwDeviceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceAssociation.STEREOTYPE_NAME);
        return HwDeviceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwDeviceAssociation} proxy from a {@link Association} stereotyped << HwDevice_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwDeviceAssociation} proxy or <i>null</i>.
     */
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
    public static HwDeviceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwDeviceAssociation.canInstantiate(obj))
        	return new HwDeviceAssociation(obj);
        else
        	throw new IllegalArgumentException("HwDeviceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwDeviceAssociation other = (HwDeviceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwDevice_Association_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDevice_Association_mainScheduler() {
        return this.elt.getTagValue(HwDeviceAssociation.MdaTypes.HWDEVICE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDevice_Association_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDevice_Association_speedFactor() {
        return this.elt.getTagValue(HwDeviceAssociation.MdaTypes.HWDEVICE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDevice_Association_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDevice_Association_mainScheduler(final String value) {
        this.elt.putTagValue(HwDeviceAssociation.MdaTypes.HWDEVICE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDevice_Association_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDevice_Association_speedFactor(final String value) {
        this.elt.putTagValue(HwDeviceAssociation.MdaTypes.HWDEVICE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    protected HwDeviceAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWDEVICE_ASSOCIATION_SPEEDFACTOR_TAGTYPE_ELT;

        public static TagType HWDEVICE_ASSOCIATION_MAINSCHEDULER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
