/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("53f4228a-dec8-4a97-93f3-17fff7aa76bf")
    public static final String STEREOTYPE_NAME = "HwBranchPredictor_Instance";

    /**
     * Tells whether a {@link HwBranchPredictorInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << HwBranchPredictor_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8faca69a-78ba-4eb8-b792-329e58ccfa72")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << HwBranchPredictor_Instance >> then instantiate a {@link HwBranchPredictorInstance} proxy.
     * 
     * @return a {@link HwBranchPredictorInstance} proxy on the created {@link Instance}.
     */
    @objid ("c1fce09c-c632-444e-8089-563a7aec72f1")
    public static HwBranchPredictorInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorInstance.STEREOTYPE_NAME);
        return HwBranchPredictorInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorInstance} proxy from a {@link Instance} stereotyped << HwBranchPredictor_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link HwBranchPredictorInstance} proxy or <i>null</i>.
     */
    @objid ("c5c70a73-7f71-42d1-b01a-9f4353777f27")
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
    @objid ("ff96d144-72dd-4546-89bf-bc60540130cc")
    public static HwBranchPredictorInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (HwBranchPredictorInstance.canInstantiate(obj))
        	return new HwBranchPredictorInstance(obj);
        else
        	throw new IllegalArgumentException("HwBranchPredictorInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c05034cb-5e4c-42af-9731-b0b187f4a844")
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
    @objid ("73f6f979-1ef6-4e0f-823c-0a55fafe8fa5")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("7585e41c-7b3c-443f-ba07-252ba26cc363")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9c57783d-a827-41b9-ad4f-4f25cf6e9e1c")
    protected HwBranchPredictorInstance(final Instance elt) {
        super(elt);
    }

    @objid ("6b9e57ca-5090-412b-9807-4b5e6aae245a")
    public static final class MdaTypes {
        @objid ("52ec2153-6847-475b-98eb-0b1a37f4e51f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4393c966-0734-40e8-9cb8-6e26e9bb995a")
        private static Stereotype MDAASSOCDEP;

        @objid ("cf468069-62fb-4dec-9d5e-e9d0490430c4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9ad817d9-4957-4787-86e1-5ab8d1d060ab")
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
