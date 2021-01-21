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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_trace_GaWorkloadEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("4383a130-5936-41c3-9ab1-b2958b7e15e3")
public class ProfileAssociationTraceGaWorkloadEvent {
    @objid ("6c775702-6fa1-4685-9f37-fb3c4a1a506e")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_trace_GaWorkloadEvent";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("b966ddb2-4b5d-41b7-af55-b6a162f6766c")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationTraceGaWorkloadEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_trace_GaWorkloadEvent >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("de8e6a56-7599-49fa-a834-d31bfdfe3b3d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationTraceGaWorkloadEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_trace_GaWorkloadEvent >> then instantiate a {@link ProfileAssociationTraceGaWorkloadEvent} proxy.
     * 
     * @return a {@link ProfileAssociationTraceGaWorkloadEvent} proxy on the created {@link Dependency}.
     */
    @objid ("dc21a106-6d31-4e59-b6e4-9553a5413ce0")
    public static ProfileAssociationTraceGaWorkloadEvent create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationTraceGaWorkloadEvent.STEREOTYPE_NAME);
        return ProfileAssociationTraceGaWorkloadEvent.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationTraceGaWorkloadEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_trace_GaWorkloadEvent >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationTraceGaWorkloadEvent} proxy or <i>null</i>.
     */
    @objid ("068694d0-2bb7-4ba6-abbc-f46f3808bc81")
    public static ProfileAssociationTraceGaWorkloadEvent instantiate(final Dependency obj) {
        return ProfileAssociationTraceGaWorkloadEvent.canInstantiate(obj) ? new ProfileAssociationTraceGaWorkloadEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationTraceGaWorkloadEvent} proxy from a {@link Dependency} stereotyped << ProfileAssociation_trace_GaWorkloadEvent >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationTraceGaWorkloadEvent} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2d94bffd-5b28-4e75-a0f5-ba0dc93193a4")
    public static ProfileAssociationTraceGaWorkloadEvent safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationTraceGaWorkloadEvent.canInstantiate(obj))
        	return new ProfileAssociationTraceGaWorkloadEvent(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationTraceGaWorkloadEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("39d98be2-a5d2-4beb-af01-3dc680ee5cf0")
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
        ProfileAssociationTraceGaWorkloadEvent other = (ProfileAssociationTraceGaWorkloadEvent) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("73fd933b-e617-41b8-b845-de242f7611f8")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("39528683-2c91-4519-9f79-505ccdda071c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("59658917-0b0d-41ff-b2c1-8f60aab3054e")
    protected ProfileAssociationTraceGaWorkloadEvent(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("32c4131d-5807-47ef-a408-fe04d3530581")
    public static final class MdaTypes {
        @objid ("dbee846d-b9f7-400a-a83b-4f7980a30130")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("56c2c12a-360f-40d6-a783-c5fedce55f93")
        private static Stereotype MDAASSOCDEP;

        @objid ("5dd20b2b-39ef-4059-847b-e26ad6c9a071")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("910e5d66-1576-4ccb-bd9c-263b11a187e8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cfb04031-dd1f-11e0-a2be-0027103f347c");
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
