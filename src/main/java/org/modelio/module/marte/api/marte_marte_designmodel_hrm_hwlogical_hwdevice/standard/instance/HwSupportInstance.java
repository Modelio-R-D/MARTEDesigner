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
 * Proxy class to handle a {@link Instance} with << HwSupport_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c1def90c-0ebf-4d1d-a132-3d1b89ba8b64")
public class HwSupportInstance extends HwDeviceInstance {
    @objid ("2f19ccb5-b737-414c-8492-ca42fbb7950e")
    public static final String STEREOTYPE_NAME = "HwSupport_Instance";

    /**
     * Tells whether a {@link HwSupportInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwSupport_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7f3caf60-d460-4a33-9777-7a09eb00eefd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwSupport_Instance >> then instantiate a {@link HwSupportInstance} proxy.
     * 
     * @return a {@link HwSupportInstance} proxy on the created {@link Instance}.
     */
    @objid ("f16fd8ec-3540-420d-b5e1-241f6f2b92b5")
    public static HwSupportInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwSupportInstance.STEREOTYPE_NAME);
        return HwSupportInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwSupportInstance} proxy from a {@link Instance} stereotyped << HwSupport_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwSupportInstance} proxy or <i>null</i>.
     */
    @objid ("ea46ea2d-6fba-4cd7-8fd4-d8d1e1119c9f")
    public static HwSupportInstance instantiate(final Instance obj) {
        return HwSupportInstance.canInstantiate(obj) ? new HwSupportInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwSupportInstance} proxy from a {@link Instance} stereotyped << HwSupport_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwSupportInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("126dd18b-06ad-4844-bf96-28cf06eb0c85")
    public static HwSupportInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwSupportInstance.canInstantiate(obj))
        	return new HwSupportInstance(obj);
        else
        	throw new IllegalArgumentException("HwSupportInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("822dfce1-ccdc-42db-a8c9-77cefbe4dc0d")
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
        HwSupportInstance other = (HwSupportInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("d0c15d49-6a0d-4444-8609-042e1ed000ac")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("cd67d8ee-b839-477f-a27c-5891642cb8ae")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b448000e-321e-46e5-9128-b0dad11200f1")
    protected HwSupportInstance(final Instance elt) {
        super(elt);
    }

    @objid ("49cd0a6a-3dfd-47e5-bb27-926d3d3c3a68")
    public static final class MdaTypes {
        @objid ("538ab5b8-6460-4652-9313-73fdfb679b76")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("88bfe0dd-b56f-4094-b526-dc75b327442f")
        private static Stereotype MDAASSOCDEP;

        @objid ("1095783b-6213-4508-9db2-22d69b7a2e72")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e6f503c6-4183-44cc-94e8-f751531f9b9e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "013ca29c-0ccf-11df-8525-001302895b2b");
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
