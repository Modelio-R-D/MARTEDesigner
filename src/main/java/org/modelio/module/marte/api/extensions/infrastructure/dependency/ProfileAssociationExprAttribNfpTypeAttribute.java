/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_exprAttrib_NfpType_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a03b5e44-cd9f-4128-82a8-6f13c68a346c")
public class ProfileAssociationExprAttribNfpTypeAttribute {
    @objid ("e64b2fcb-baf9-4750-b1ef-ff1f7dcf8533")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_exprAttrib_NfpType_Attribute";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("15d599e4-3d5c-4d9f-b1d6-481db6c462e4")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationExprAttribNfpTypeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_exprAttrib_NfpType_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("51934bf1-e016-49de-9582-cdd49c1f8543")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationExprAttribNfpTypeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_exprAttrib_NfpType_Attribute >> then instantiate a {@link ProfileAssociationExprAttribNfpTypeAttribute} proxy.
     * 
     * @return a {@link ProfileAssociationExprAttribNfpTypeAttribute} proxy on the created {@link Dependency}.
     */
    @objid ("e8578a68-984a-424a-a70b-0d2972a06061")
    public static ProfileAssociationExprAttribNfpTypeAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationExprAttribNfpTypeAttribute.STEREOTYPE_NAME);
        return ProfileAssociationExprAttribNfpTypeAttribute.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationExprAttribNfpTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_exprAttrib_NfpType_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationExprAttribNfpTypeAttribute} proxy or <i>null</i>.
     */
    @objid ("05872866-d186-4fea-a6b7-156c96244809")
    public static ProfileAssociationExprAttribNfpTypeAttribute instantiate(final Dependency obj) {
        return ProfileAssociationExprAttribNfpTypeAttribute.canInstantiate(obj) ? new ProfileAssociationExprAttribNfpTypeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationExprAttribNfpTypeAttribute} proxy from a {@link Dependency} stereotyped << ProfileAssociation_exprAttrib_NfpType_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationExprAttribNfpTypeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("87f12d81-ca2e-4502-821d-64d222943388")
    public static ProfileAssociationExprAttribNfpTypeAttribute safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationExprAttribNfpTypeAttribute.canInstantiate(obj))
        	return new ProfileAssociationExprAttribNfpTypeAttribute(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationExprAttribNfpTypeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6f63453b-af3e-4c17-94fe-3fd45bda50f8")
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
        ProfileAssociationExprAttribNfpTypeAttribute other = (ProfileAssociationExprAttribNfpTypeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("09d7bcae-42f3-49f0-b909-6a6610a3d797")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("467606e2-fbf4-4ccf-a432-fb03b50a5ee7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("7007c3f4-130b-4b0d-90d1-250f45d73414")
    protected ProfileAssociationExprAttribNfpTypeAttribute(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("e82ff801-5d10-464d-8663-b9b08ef8a3d2")
    public static final class MdaTypes {
        @objid ("45d75dfc-a55c-4b00-b2ea-5e3e87bf3ba0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("daab2025-084d-4d52-be89-aa15d05f4fe2")
        private static Stereotype MDAASSOCDEP;

        @objid ("0ac6d18f-4131-45d5-b50c-9ef600d145c2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("36878498-34c6-4b7d-b459-94c8f82c63b8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e8367ac8-7e0c-11df-9e39-0014222a9f79");
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
