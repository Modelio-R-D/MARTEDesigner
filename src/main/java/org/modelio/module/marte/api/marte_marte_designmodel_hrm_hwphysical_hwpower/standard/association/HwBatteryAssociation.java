/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.association;

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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwBattery_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f64a7cdf-81ad-4754-b33f-3b3b7cac14cd")
public class HwBatteryAssociation extends HwPowerSupplyAssociation {
    @objid ("4051a6ef-1759-463f-99e8-73fde562825a")
    public static final String STEREOTYPE_NAME = "HwBattery_Association";

    @objid ("cfe59f1f-cd3e-4f7b-9795-7a14561449f4")
    public static final String HWBATTERY_ASSOCIATION_CAPACITY_TAGTYPE = "HwBattery_Association_capacity";

    /**
     * Tells whether a {@link HwBatteryAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwBattery_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e1c77888-2ad8-4be8-b125-dec86862adda")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwBattery_Association >> then instantiate a {@link HwBatteryAssociation} proxy.
     * 
     * @return a {@link HwBatteryAssociation} proxy on the created {@link Association}.
     */
    @objid ("831a25e4-d887-4fd1-b1cd-0f0f61c28a68")
    public static HwBatteryAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryAssociation.STEREOTYPE_NAME);
        return HwBatteryAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwBatteryAssociation} proxy from a {@link Association} stereotyped << HwBattery_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwBatteryAssociation} proxy or <i>null</i>.
     */
    @objid ("809f2036-5639-4adb-8ae0-967472a0a44b")
    public static HwBatteryAssociation instantiate(final Association obj) {
        return HwBatteryAssociation.canInstantiate(obj) ? new HwBatteryAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBatteryAssociation} proxy from a {@link Association} stereotyped << HwBattery_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwBatteryAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d7bdf36e-6a4f-4a39-bdcc-524cd8846222")
    public static HwBatteryAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwBatteryAssociation.canInstantiate(obj))
        	return new HwBatteryAssociation(obj);
        else
        	throw new IllegalArgumentException("HwBatteryAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("abbddc55-3e86-4bcf-82ea-75b1d332c195")
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
        HwBatteryAssociation other = (HwBatteryAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("8c9f6d4f-7c96-4a8c-be6f-cca28ee0da6b")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwBattery_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4706caee-7df0-4a67-ad5d-5456c1c19057")
    public String getHwBattery_Association_capacity() {
        return this.elt.getTagValue(HwBatteryAssociation.MdaTypes.HWBATTERY_ASSOCIATION_CAPACITY_TAGTYPE_ELT);
    }

    @objid ("12fabadf-c2f0-4266-931a-19ec7c1941f1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwBattery_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e400d9b0-d159-47d9-bfbd-1579a3616304")
    public void setHwBattery_Association_capacity(final String value) {
        this.elt.putTagValue(HwBatteryAssociation.MdaTypes.HWBATTERY_ASSOCIATION_CAPACITY_TAGTYPE_ELT, value);
    }

    @objid ("59bf649c-ff24-4a69-9d5d-47345a9a2182")
    protected HwBatteryAssociation(final Association elt) {
        super(elt);
    }

    @objid ("9086dd1c-157e-4d9d-bc7e-09e61d26ae41")
    public static final class MdaTypes {
        @objid ("53385ea6-50cb-44f4-b1bd-c45203eaca20")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a5f752be-660e-4e89-af33-c93622408233")
        public static TagType HWBATTERY_ASSOCIATION_CAPACITY_TAGTYPE_ELT;

        @objid ("b0bb7e9d-59dc-44b0-9a13-897d90e8a575")
        private static Stereotype MDAASSOCDEP;

        @objid ("9b31eeb4-6c85-450c-81db-70603d1fdfea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("573a7238-1561-4660-b6c3-31770d63fb5c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "563acf1e-c7b2-11df-ad39-001302895b2b");
            HWBATTERY_ASSOCIATION_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "563acf2a-c7b2-11df-ad39-001302895b2b");
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
