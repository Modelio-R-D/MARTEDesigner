/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance;

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
 * Proxy class to handle a {@link Instance} with << ClockResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("21ec44f5-b96f-4d0d-a98d-d2e56d960bdc")
public class ClockResourceInstance extends TimerResourceInstance {
    @objid ("a018abf4-a7cc-4962-b128-bffa04777aa7")
    public static final String STEREOTYPE_NAME = "ClockResource_Instance";

    /**
     * Tells whether a {@link ClockResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ClockResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9236e376-547a-46d4-a950-b710abb2686f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << ClockResource_Instance >> then instantiate a {@link ClockResourceInstance} proxy.
     * 
     * @return a {@link ClockResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("923de029-7db8-4cea-9a66-e921e1a05c78")
    public static ClockResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockResourceInstance.STEREOTYPE_NAME);
        return ClockResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link ClockResourceInstance} proxy from a {@link Instance} stereotyped << ClockResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link ClockResourceInstance} proxy or <i>null</i>.
     */
    @objid ("070570b4-3790-4492-9cbb-e2cd85b1d71e")
    public static ClockResourceInstance instantiate(final Instance obj) {
        return ClockResourceInstance.canInstantiate(obj) ? new ClockResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockResourceInstance} proxy from a {@link Instance} stereotyped << ClockResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link ClockResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("76a35529-a487-4ab6-8ea2-d7fd8c20d2de")
    public static ClockResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (ClockResourceInstance.canInstantiate(obj))
        	return new ClockResourceInstance(obj);
        else
        	throw new IllegalArgumentException("ClockResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9b2bb8ad-06d6-4cd1-9af4-5c97e2684f0d")
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
        ClockResourceInstance other = (ClockResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("5f3eb18d-fcdf-4fec-9fc3-24eec973551b")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("7c1408b4-3818-403b-8abd-ec64c607a854")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9057da30-1537-4498-a474-38144628f328")
    protected ClockResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("2ea2c595-b03f-48e2-be77-b835265ac133")
    public static final class MdaTypes {
        @objid ("f7a290a9-0563-4c4a-b9f9-8104a01ce3f4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d8502cc7-393c-446f-a6d6-af88d94ab492")
        private static Stereotype MDAASSOCDEP;

        @objid ("9cf9a696-ff87-4eda-9ef6-5d628b7d5c98")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9efaf92e-fcf6-4ba4-87bf-3e0894aa4340")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fb388ec5-0f42-11df-8c52-0014222a9f79");
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
