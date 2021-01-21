/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwSensor_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4e3b13b9-e8ae-4afb-8fa2-5dea90393461")
public class HwSensorInstance extends HwIOInstance {
    @objid ("80093596-9c88-4861-a204-d5c8b3b03a9a")
    public static final String STEREOTYPE_NAME = "HwSensor_Instance";

    /**
     * Tells whether a {@link HwSensorInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwSensor_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("85171258-4fcf-42d1-ae8c-c2da5725825e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwSensor_Instance >> then instantiate a {@link HwSensorInstance} proxy.
     * 
     * @return a {@link HwSensorInstance} proxy on the created {@link Instance}.
     */
    @objid ("3d7f01e4-bf70-455b-83c6-8f7502604a34")
    public static HwSensorInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSensorInstance.STEREOTYPE_NAME);
        return HwSensorInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwSensorInstance} proxy from a {@link Instance} stereotyped << HwSensor_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwSensorInstance} proxy or <i>null</i>.
     */
    @objid ("9518f302-a6e0-4ad3-861f-24718cc1d567")
    public static HwSensorInstance instantiate(final Instance obj) {
        return HwSensorInstance.canInstantiate(obj) ? new HwSensorInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSensorInstance} proxy from a {@link Instance} stereotyped << HwSensor_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwSensorInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1bcf3403-ff64-445f-b7a6-c7eebe551e27")
    public static HwSensorInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwSensorInstance.canInstantiate(obj))
        	return new HwSensorInstance(obj);
        else
        	throw new IllegalArgumentException("HwSensorInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("93d61c99-e1a0-4dc2-8ed6-c0c49ba017a3")
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
        HwSensorInstance other = (HwSensorInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("7f089ad1-68af-4680-92db-35cc7d3ee056")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("49e7bdf9-7347-4f33-bfa6-bfa26e0420b2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5d028f47-2a90-4aec-b445-b2b02d342ceb")
    protected HwSensorInstance(final Instance elt) {
        super(elt);
    }

    @objid ("69305d49-6b05-486b-b1ce-717249cb099c")
    public static final class MdaTypes {
        @objid ("6c850e22-8e52-4293-af3e-9d27a74fc040")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0ea0e008-8eca-4c6a-924e-66a6177c77d6")
        private static Stereotype MDAASSOCDEP;

        @objid ("a08d1912-6fac-4f88-8e7f-5e425b3353ec")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("16d16213-e202-4828-8dab-8d1109053fc5")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e89de84c-c7ac-11df-ad39-001302895b2b");
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
