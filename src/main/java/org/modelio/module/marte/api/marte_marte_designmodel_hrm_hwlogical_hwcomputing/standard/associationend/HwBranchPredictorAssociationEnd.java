/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.associationend.HwResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwBranchPredictor_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwBranchPredictorAssociationEnd extends HwResourceAssociationEnd {
    public static final String STEREOTYPE_NAME = "HwBranchPredictor_AssociationEnd";

    /**
     * Tells whether a {@link HwBranchPredictorAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwBranchPredictor_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwBranchPredictor_AssociationEnd >> then instantiate a {@link HwBranchPredictorAssociationEnd} proxy.
     * 
     * @return a {@link HwBranchPredictorAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static HwBranchPredictorAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorAssociationEnd.STEREOTYPE_NAME);
        return HwBranchPredictorAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwBranchPredictor_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwBranchPredictorAssociationEnd} proxy or <i>null</i>.
     */
    public static HwBranchPredictorAssociationEnd instantiate(final AssociationEnd obj) {
        return HwBranchPredictorAssociationEnd.canInstantiate(obj) ? new HwBranchPredictorAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwBranchPredictor_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwBranchPredictorAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwBranchPredictorAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwBranchPredictorAssociationEnd.canInstantiate(obj))
        	return new HwBranchPredictorAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwBranchPredictorAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwBranchPredictorAssociationEnd other = (HwBranchPredictorAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected HwBranchPredictorAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00fc43f1-0ccf-11df-8525-001302895b2b");
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
