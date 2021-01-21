/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association;

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
 * Proxy class to handle a {@link Association} with << ComputingResource_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5f11a563-8303-4115-b024-51eb0df8467e")
public class ComputingResourceAssociation extends MutualExclusionResourceAssociation {
    @objid ("60ced193-4b80-482b-9f94-891df3d32461")
    public static final String STEREOTYPE_NAME = "ComputingResource_Association";

    /**
     * Tells whether a {@link ComputingResourceAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << ComputingResource_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("314749d8-e523-4827-a7ef-333355f43dbd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << ComputingResource_Association >> then instantiate a {@link ComputingResourceAssociation} proxy.
     * 
     * @return a {@link ComputingResourceAssociation} proxy on the created {@link Association}.
     */
    @objid ("af77ac2c-d59f-4b08-8b6b-e7733c6e6740")
    public static ComputingResourceAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ComputingResourceAssociation.STEREOTYPE_NAME);
        return ComputingResourceAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link ComputingResourceAssociation} proxy from a {@link Association} stereotyped << ComputingResource_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link ComputingResourceAssociation} proxy or <i>null</i>.
     */
    @objid ("e2e76f26-993c-410a-bbf7-1cc1d8c56f29")
    public static ComputingResourceAssociation instantiate(final Association obj) {
        return ComputingResourceAssociation.canInstantiate(obj) ? new ComputingResourceAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ComputingResourceAssociation} proxy from a {@link Association} stereotyped << ComputingResource_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link ComputingResourceAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8818bb87-9550-42f7-9321-bdd76fcc596c")
    public static ComputingResourceAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (ComputingResourceAssociation.canInstantiate(obj))
        	return new ComputingResourceAssociation(obj);
        else
        	throw new IllegalArgumentException("ComputingResourceAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c16aa0bf-a30b-4fea-9d2b-b305c8a3133a")
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
        ComputingResourceAssociation other = (ComputingResourceAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("11cacf9e-36d2-458b-a559-f3475cce299e")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    @objid ("efb8c8d2-1a31-4c71-b2ef-b6d3e9b9e7bc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("55973ba6-4bab-4e00-983f-91d69e5bec61")
    protected ComputingResourceAssociation(final Association elt) {
        super(elt);
    }

    @objid ("784fd840-b0c0-4e68-87f7-43a91463dc57")
    public static final class MdaTypes {
        @objid ("6b308a68-c4c9-4380-85ee-dcef3e94992e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("54e8c36b-270b-401f-8457-cd0ad01dea55")
        private static Stereotype MDAASSOCDEP;

        @objid ("ef543630-203c-4352-8cef-a4f1b1db9be8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3408f0b5-69d3-464c-a578-54ace56c7fd7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0e60e94e-1019-11df-86fe-0014222a9f79");
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
