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
 * Proxy class to handle a {@link Instance} with << HwActuator_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("39d92f88-724c-4b6f-abd6-bf22c48382d8")
public class HwActuatorInstance extends HwIOInstance {
    @objid ("4a26e471-f42d-4099-8d08-6b7d7ca90f4e")
    public static final String STEREOTYPE_NAME = "HwActuator_Instance";

    /**
     * Tells whether a {@link HwActuatorInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwActuator_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b144649a-31dc-46ee-a274-2e679b624b53")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwActuator_Instance >> then instantiate a {@link HwActuatorInstance} proxy.
     * 
     * @return a {@link HwActuatorInstance} proxy on the created {@link Instance}.
     */
    @objid ("91ff1e5c-97de-46d7-aa08-11f0c01f5d77")
    public static HwActuatorInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwActuatorInstance.STEREOTYPE_NAME);
        return HwActuatorInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwActuatorInstance} proxy from a {@link Instance} stereotyped << HwActuator_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwActuatorInstance} proxy or <i>null</i>.
     */
    @objid ("b6fc9481-0fc5-44b2-b477-f1e29c4b014c")
    public static HwActuatorInstance instantiate(final Instance obj) {
        return HwActuatorInstance.canInstantiate(obj) ? new HwActuatorInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwActuatorInstance} proxy from a {@link Instance} stereotyped << HwActuator_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwActuatorInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("36311ea9-fc4c-4b76-986e-4d25cdaace3b")
    public static HwActuatorInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwActuatorInstance.canInstantiate(obj))
        	return new HwActuatorInstance(obj);
        else
        	throw new IllegalArgumentException("HwActuatorInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a6e6f7d9-0e01-468e-923c-f4405f487f4b")
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
        HwActuatorInstance other = (HwActuatorInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("36b6168d-8a83-416b-a644-0810a085c71c")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("48d1ff81-33d2-4f8f-8c28-677c2392a697")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("213230fb-de0a-4433-9eb5-35f2c4b82642")
    protected HwActuatorInstance(final Instance elt) {
        super(elt);
    }

    @objid ("600f5aef-5e0f-4ba3-a3cf-6b231235229e")
    public static final class MdaTypes {
        @objid ("e1c1e58c-235c-4785-b192-a4b276536982")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3be3423b-0eb2-4930-a1b5-f3c969efc194")
        private static Stereotype MDAASSOCDEP;

        @objid ("fd0605c7-2bce-4f1b-a927-1b1fe1758f58")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1ad19ed4-33de-4b42-b155-7dfdd5c84d12")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "88a37413-c7ac-11df-ad39-001302895b2b");
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
