/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcomputing.standard.association;

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
 * Proxy class to handle a {@link Association} with << HwBranchPredictor_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c89bd740-0e2d-4148-8650-329668a4a340")
public class HwBranchPredictorAssociation extends HwResourceAssociation {
    @objid ("1824de31-2821-43bd-aae8-2e8fb8f13f20")
    public static final String STEREOTYPE_NAME = "HwBranchPredictor_Association";

    /**
     * Tells whether a {@link HwBranchPredictorAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwBranchPredictor_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("93849fae-9271-43ee-8d6c-318987b2f122")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwBranchPredictor_Association >> then instantiate a {@link HwBranchPredictorAssociation} proxy.
     * 
     * @return a {@link HwBranchPredictorAssociation} proxy on the created {@link Association}.
     */
    @objid ("1f8d6da2-5641-4076-b78b-6fc73983e7d2")
    public static HwBranchPredictorAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBranchPredictorAssociation.STEREOTYPE_NAME);
        return HwBranchPredictorAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorAssociation} proxy from a {@link Association} stereotyped << HwBranchPredictor_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwBranchPredictorAssociation} proxy or <i>null</i>.
     */
    @objid ("6ba48709-0568-4ce8-afbe-032c80c92873")
    public static HwBranchPredictorAssociation instantiate(final Association obj) {
        return HwBranchPredictorAssociation.canInstantiate(obj) ? new HwBranchPredictorAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBranchPredictorAssociation} proxy from a {@link Association} stereotyped << HwBranchPredictor_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwBranchPredictorAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("27f0c419-571d-4e70-9d49-e007a0f35ad3")
    public static HwBranchPredictorAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwBranchPredictorAssociation.canInstantiate(obj))
        	return new HwBranchPredictorAssociation(obj);
        else
        	throw new IllegalArgumentException("HwBranchPredictorAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b1ea7692-814c-4908-a8f1-287079db6d93")
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
        HwBranchPredictorAssociation other = (HwBranchPredictorAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("4f2cf7f3-4967-4266-8eab-0d5e72105b7c")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("36a38a68-cb15-465f-b888-838be697be2d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c58911cc-c63a-4d24-860f-317ff61af3b0")
    protected HwBranchPredictorAssociation(final Association elt) {
        super(elt);
    }

    @objid ("1ba976b5-019d-46fd-bde2-9a4c4396925c")
    public static final class MdaTypes {
        @objid ("4e0ef347-4e89-4d12-8dcf-c2fb8f66b3db")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("81e533e1-ef64-4e59-a232-471424ec9d7a")
        private static Stereotype MDAASSOCDEP;

        @objid ("8bf7b8e7-23f3-4cb6-b498-6542c6d18219")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c7e1c829-0255-4dfa-b917-81b424e3ddca")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "86a2b6a0-10a7-11df-81d9-0014222a9f79");
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
