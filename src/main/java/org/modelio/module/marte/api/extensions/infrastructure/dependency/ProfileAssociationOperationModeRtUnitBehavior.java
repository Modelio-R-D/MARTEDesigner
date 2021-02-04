/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_operationMode_RtUnit_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f940468a-8365-4a5f-8b7c-1f10cecb70e0")
public class ProfileAssociationOperationModeRtUnitBehavior {
    @objid ("9f1797ec-cf7d-4f07-914e-2416e2564490")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_operationMode_RtUnit_Behavior";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("46451cf3-c763-4a2d-af5a-3c106351142d")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationOperationModeRtUnitBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_operationMode_RtUnit_Behavior >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2e33b068-f085-464d-b03c-f2ccc637caf8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOperationModeRtUnitBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_operationMode_RtUnit_Behavior >> then instantiate a {@link ProfileAssociationOperationModeRtUnitBehavior} proxy.
     * 
     * @return a {@link ProfileAssociationOperationModeRtUnitBehavior} proxy on the created {@link Dependency}.
     */
    @objid ("6c942ec5-d26b-4e05-bf22-36a379039cef")
    public static ProfileAssociationOperationModeRtUnitBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationOperationModeRtUnitBehavior.STEREOTYPE_NAME);
        return ProfileAssociationOperationModeRtUnitBehavior.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOperationModeRtUnitBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_operationMode_RtUnit_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationOperationModeRtUnitBehavior} proxy or <i>null</i>.
     */
    @objid ("8f907b23-a128-485c-9cd7-34c70ff1fa85")
    public static ProfileAssociationOperationModeRtUnitBehavior instantiate(final Dependency obj) {
        return ProfileAssociationOperationModeRtUnitBehavior.canInstantiate(obj) ? new ProfileAssociationOperationModeRtUnitBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationOperationModeRtUnitBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_operationMode_RtUnit_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationOperationModeRtUnitBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3b8519af-d6d9-4628-a8b4-345a1cea827d")
    public static ProfileAssociationOperationModeRtUnitBehavior safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationOperationModeRtUnitBehavior.canInstantiate(obj))
        	return new ProfileAssociationOperationModeRtUnitBehavior(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationOperationModeRtUnitBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d1f13a81-0e3b-459b-8371-f953d60e664d")
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
        ProfileAssociationOperationModeRtUnitBehavior other = (ProfileAssociationOperationModeRtUnitBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("f72be6b6-3013-4d45-a81b-8a4a47a819c0")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("6f7da631-97b3-4565-915e-51c1c8c22d91")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0735afce-ae73-4cd5-a9b0-7903594d4938")
    protected ProfileAssociationOperationModeRtUnitBehavior(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("74ca04a5-718e-4fa9-90a6-0eb7aa1d84c1")
    public static final class MdaTypes {
        @objid ("3bccf3bd-138f-4f84-8bed-129bd4788cf8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("28de40c2-88db-43dd-bbd1-e13e025ed2eb")
        private static Stereotype MDAASSOCDEP;

        @objid ("b0b405f7-022c-401b-96f1-71515ca5ccb1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("24f5f319-4cc7-464e-9b0a-0a14d4f9d61e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d8d9fdd2-91da-11e0-a465-0027103f347c");
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
