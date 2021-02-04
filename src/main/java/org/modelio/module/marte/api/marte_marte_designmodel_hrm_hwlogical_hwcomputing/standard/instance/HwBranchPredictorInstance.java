/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.instance;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.instance.HwResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << HwBranchPredictor_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("8e56c902-2e11-4203-b3b9-6bb6905ed6c9")
public class HwBranchPredictorInstance extends HwResourceInstance {
    @objid ("e3fa68c3-a323-4b8f-9e3e-7deb73d07c0b")
    public static final String STEREOTYPE_NAME = "HwBranchPredictor_Instance";

    /**
     * Tells whether a {@link HwBranchPredictorInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwBranchPredictor_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("874a44c6-7105-4df8-b1f1-a2a826e68759")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwBranchPredictor_Instance >> then instantiate a {@link HwBranchPredictorInstance} proxy.
     * 
     * @return a {@link HwBranchPredictorInstance} proxy on the created {@link Instance}.
     */
    @objid ("f226aba8-a537-4590-85a8-8824babba21e")
    public static HwBranchPredictorInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorInstance.STEREOTYPE_NAME);
        return HwBranchPredictorInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorInstance} proxy from a {@link Instance} stereotyped << HwBranchPredictor_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwBranchPredictorInstance} proxy or <i>null</i>.
     */
    @objid ("9175df9d-f365-40b4-b011-9014de52ee90")
    public static HwBranchPredictorInstance instantiate(final Instance obj) {
        return HwBranchPredictorInstance.canInstantiate(obj) ? new HwBranchPredictorInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorInstance} proxy from a {@link Instance} stereotyped << HwBranchPredictor_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link HwBranchPredictorInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c33b973f-28c3-403f-b8c0-f7d20a815393")
    public static HwBranchPredictorInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwBranchPredictorInstance.canInstantiate(obj))
        	return new HwBranchPredictorInstance(obj);
        else
        	throw new IllegalArgumentException("HwBranchPredictorInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("35b2171a-0a41-49b3-93d9-698083a255dc")
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
        HwBranchPredictorInstance other = (HwBranchPredictorInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("92f8a208-53ec-487e-b046-568d14c6b8d0")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("391b932b-c88e-4239-8245-61f9a7953336")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("59547fd2-f02f-4ef8-b579-344a0123069c")
    protected HwBranchPredictorInstance(final Instance elt) {
        super(elt);
    }

    @objid ("6b9e57ca-5090-412b-9807-4b5e6aae245a")
    public static final class MdaTypes {
        @objid ("7110713d-d11c-4253-8256-48fe31f9a474")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9a6de373-c84c-4ea7-aa32-1c1215ff759b")
        private static Stereotype MDAASSOCDEP;

        @objid ("10f8c047-b8a0-41e4-bdf4-6507f8db67ef")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("98e9c673-2d6e-4c89-aaf8-d5f1f584dc64")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00fc43f6-0ccf-11df-8525-001302895b2b");
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
