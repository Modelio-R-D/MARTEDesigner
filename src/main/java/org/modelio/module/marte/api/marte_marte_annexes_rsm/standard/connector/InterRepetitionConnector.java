/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_annexes_rsm.standard.connector;

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
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Connector} with << InterRepetition_Connector >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c4f06728-c924-4472-ac26-f198f7f938a5")
public class InterRepetitionConnector extends LinkTopologyConnector {
    @objid ("435993f8-323f-4747-9d3d-e3b3312db625")
    public static final String STEREOTYPE_NAME = "InterRepetition_Connector";

    @objid ("678f7f71-2bfd-4e5c-aaeb-0fdfe4132d11")
    public static final String INTERREPETITION_CONNECTOR_ISMODULO_TAGTYPE = "InterRepetition_Connector_isModulo";

    @objid ("5cdf5b28-edee-4b44-84d8-2c4b2a72c0b8")
    public static final String INTERREPETITION_CONNECTOR_REPETITIONSHAPEDEPENDENCE_TAGTYPE = "InterRepetition_Connector_repetitionShapeDependence";

    /**
     * Tells whether a {@link InterRepetitionConnector proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << InterRepetition_Connector >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("fb59ea19-620d-49dd-be31-da52971b3df2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterRepetitionConnector.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << InterRepetition_Connector >> then instantiate a {@link InterRepetitionConnector} proxy.
     * 
     * @return a {@link InterRepetitionConnector} proxy on the created {@link Connector}.
     */
    @objid ("408d0033-9723-4238-8b7a-c2207812dd03")
    public static InterRepetitionConnector create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Connector");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, InterRepetitionConnector.STEREOTYPE_NAME);
        return InterRepetitionConnector.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link InterRepetitionConnector} proxy from a {@link Connector} stereotyped << InterRepetition_Connector >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link InterRepetitionConnector} proxy or <i>null</i>.
     */
    @objid ("1026bcbf-1d7f-47e6-9729-633dd7ea1fb3")
    public static InterRepetitionConnector instantiate(final Connector obj) {
        return InterRepetitionConnector.canInstantiate(obj) ? new InterRepetitionConnector(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterRepetitionConnector} proxy from a {@link Connector} stereotyped << InterRepetition_Connector >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link InterRepetitionConnector} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a6fb64d5-ddb5-49db-90b5-ad216a5cf99b")
    public static InterRepetitionConnector safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (InterRepetitionConnector.canInstantiate(obj))
        	return new InterRepetitionConnector(obj);
        else
        	throw new IllegalArgumentException("InterRepetitionConnector: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7e9d0a80-f052-4500-a0fd-53d850f44318")
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
        InterRepetitionConnector other = (InterRepetitionConnector) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("f2064682-f89a-479f-b637-1aebc3c8f95c")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    /**
     * Getter for string property 'InterRepetition_Connector_repetitionShapeDependence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0ca26e30-9b3c-4d01-b50b-bdcaa7c82aff")
    public String getInterRepetition_Connector_repetitionShapeDependence() {
        return this.elt.getTagValue(InterRepetitionConnector.MdaTypes.INTERREPETITION_CONNECTOR_REPETITIONSHAPEDEPENDENCE_TAGTYPE_ELT);
    }

    @objid ("3e4c84c4-add0-4602-9c3c-14f2c5585a82")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterRepetition_Connector_isModulo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cf04165a-6f07-4172-bfab-2e2e4bb15372")
    public boolean isInterRepetition_Connector_isModulo() {
        return this.elt.isTagged(InterRepetitionConnector.MdaTypes.INTERREPETITION_CONNECTOR_ISMODULO_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterRepetition_Connector_isModulo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e8663994-81de-4259-9ac2-690662ffcb97")
    public void setInterRepetition_Connector_isModulo(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(InterRepetitionConnector.MdaTypes.INTERREPETITION_CONNECTOR_ISMODULO_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(InterRepetitionConnector.MdaTypes.INTERREPETITION_CONNECTOR_ISMODULO_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'InterRepetition_Connector_repetitionShapeDependence'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a950ea43-dcb5-4bbf-8819-5081128f54cf")
    public void setInterRepetition_Connector_repetitionShapeDependence(final String value) {
        this.elt.putTagValue(InterRepetitionConnector.MdaTypes.INTERREPETITION_CONNECTOR_REPETITIONSHAPEDEPENDENCE_TAGTYPE_ELT, value);
    }

    @objid ("51c50da7-e0f3-40aa-abd3-01e2eca85d41")
    protected InterRepetitionConnector(final Connector elt) {
        super(elt);
    }

    @objid ("83daa347-a1a5-4845-b640-afcdeea312b9")
    public static final class MdaTypes {
        @objid ("6e54221a-6fbb-4e3c-8feb-63bc9b992058")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f3dfa34f-3ba6-4776-927e-41b6c1376216")
        public static TagType INTERREPETITION_CONNECTOR_REPETITIONSHAPEDEPENDENCE_TAGTYPE_ELT;

        @objid ("7bd5096a-c50b-46fd-96e0-e4acb04b63a4")
        public static TagType INTERREPETITION_CONNECTOR_ISMODULO_TAGTYPE_ELT;

        @objid ("0a09e0c3-bf26-4cf3-9cce-b3df53a607e7")
        private static Stereotype MDAASSOCDEP;

        @objid ("fa5857e9-730c-4895-8020-c33433aeb13f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e1fe4143-969c-451d-9cbb-d7e6b36fc5cd")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03d367b8-0ccf-11df-8525-001302895b2b");
            INTERREPETITION_CONNECTOR_REPETITIONSHAPEDEPENDENCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367b9-0ccf-11df-8525-001302895b2b");
            INTERREPETITION_CONNECTOR_ISMODULO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03d367ba-0ccf-11df-8525-001302895b2b");
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
