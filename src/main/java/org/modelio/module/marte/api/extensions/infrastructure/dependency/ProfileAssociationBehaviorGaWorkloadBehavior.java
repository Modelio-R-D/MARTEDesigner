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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_behavior_GaWorkloadBehavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("74bb7212-f2f8-415c-864b-fa0d183acd1b")
public class ProfileAssociationBehaviorGaWorkloadBehavior {
    @objid ("a0eac65b-6dda-41f7-9a1a-c3477cb2c056")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_behavior_GaWorkloadBehavior";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("e0ed67d8-f0e9-47f8-b40b-7b5bbd743445")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationBehaviorGaWorkloadBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_behavior_GaWorkloadBehavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5622b65a-9b64-401e-aaa5-b07df2f8ed8b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBehaviorGaWorkloadBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_behavior_GaWorkloadBehavior >> then instantiate a {@link ProfileAssociationBehaviorGaWorkloadBehavior} proxy.
     * 
     * @return a {@link ProfileAssociationBehaviorGaWorkloadBehavior} proxy on the created {@link Dependency}.
     */
    @objid ("0f153a25-c898-472b-87d5-7c6b008879ac")
    public static ProfileAssociationBehaviorGaWorkloadBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationBehaviorGaWorkloadBehavior.STEREOTYPE_NAME);
        return ProfileAssociationBehaviorGaWorkloadBehavior.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBehaviorGaWorkloadBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_behavior_GaWorkloadBehavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationBehaviorGaWorkloadBehavior} proxy or <i>null</i>.
     */
    @objid ("8cd0abc6-f060-49ff-a393-61c7ba1857c3")
    public static ProfileAssociationBehaviorGaWorkloadBehavior instantiate(final Dependency obj) {
        return ProfileAssociationBehaviorGaWorkloadBehavior.canInstantiate(obj) ? new ProfileAssociationBehaviorGaWorkloadBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationBehaviorGaWorkloadBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_behavior_GaWorkloadBehavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationBehaviorGaWorkloadBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("efd4c097-ae51-49d8-978f-f54a8d36c9cb")
    public static ProfileAssociationBehaviorGaWorkloadBehavior safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationBehaviorGaWorkloadBehavior.canInstantiate(obj))
        	return new ProfileAssociationBehaviorGaWorkloadBehavior(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationBehaviorGaWorkloadBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6c4444ec-5055-431a-97ac-f89bd0425b9c")
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
        ProfileAssociationBehaviorGaWorkloadBehavior other = (ProfileAssociationBehaviorGaWorkloadBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("908f8730-746f-4f0e-973e-f674f1b51844")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("0ba7e0ef-e78d-4a38-8fe8-a23bd022e6ea")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e930d38e-23f1-4268-aa22-f22ea8deca17")
    protected ProfileAssociationBehaviorGaWorkloadBehavior(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("25b2cb27-4718-457c-b30c-71e72be97191")
    public static final class MdaTypes {
        @objid ("a6f2120c-0c75-45da-9c91-ff3c9324ecb6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7bab52ad-42dc-411e-9d6d-1627eb0fc97e")
        private static Stereotype MDAASSOCDEP;

        @objid ("f358215d-a07d-4ef2-84e2-a137c3554a54")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2e6c6358-e8f0-41bf-9b2b-609e6d5439ae")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a75c83e0-dd1f-11e0-a2be-0027103f347c");
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
