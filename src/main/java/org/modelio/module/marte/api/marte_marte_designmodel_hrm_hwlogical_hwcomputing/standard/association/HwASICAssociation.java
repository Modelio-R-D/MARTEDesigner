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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwASIC_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c37be7c9-2b24-4d51-ac6c-d92f1073bace")
public class HwASICAssociation extends HwComputingResourceAssociation {
    @objid ("bcf3aa6f-989e-402a-8b6c-bbb27ea0d7fa")
    public static final String STEREOTYPE_NAME = "HwASIC_Association";

    /**
     * Tells whether a {@link HwASICAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwASIC_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e81a0cc6-101e-4cfa-83b5-8de08ee31da8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwASICAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwASIC_Association >> then instantiate a {@link HwASICAssociation} proxy.
     * 
     * @return a {@link HwASICAssociation} proxy on the created {@link Association}.
     */
    @objid ("5e292307-73e4-498e-af64-376732be0649")
    public static HwASICAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwASICAssociation.STEREOTYPE_NAME);
        return HwASICAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwASICAssociation} proxy from a {@link Association} stereotyped << HwASIC_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwASICAssociation} proxy or <i>null</i>.
     */
    @objid ("b1b9fb96-192d-4d83-a00e-6c116c392cc2")
    public static HwASICAssociation instantiate(final Association obj) {
        return HwASICAssociation.canInstantiate(obj) ? new HwASICAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwASICAssociation} proxy from a {@link Association} stereotyped << HwASIC_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwASICAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1076d026-5bfa-419b-9aec-ad4177a9e458")
    public static HwASICAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwASICAssociation.canInstantiate(obj))
        	return new HwASICAssociation(obj);
        else
        	throw new IllegalArgumentException("HwASICAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cbcd053b-92db-42ac-a72e-06557307bf76")
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
        HwASICAssociation other = (HwASICAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("d68a84db-61e9-4ee3-9d9e-b8a32a9d1a91")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("5b15d328-f5c5-4bb3-beaf-52cdf27fc8d0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1f653f19-f271-4737-a4d1-1a1c234a70f9")
    protected HwASICAssociation(final Association elt) {
        super(elt);
    }

    @objid ("b1a8cb13-a4ae-4b88-a909-a3e1f8cbb3e5")
    public static final class MdaTypes {
        @objid ("9ffae698-58d8-4f70-a694-9979f77b3181")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1a62a08a-e9bb-447f-87bc-81d8c33d98ec")
        private static Stereotype MDAASSOCDEP;

        @objid ("7c478dfa-22eb-4d40-b500-965e338897ef")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("edde7a08-5359-4067-9a15-b91cd3a1e817")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b4666f29-10a3-11df-81d9-0014222a9f79");
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
