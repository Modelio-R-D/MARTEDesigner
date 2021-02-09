/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.port;

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
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Port} with << FlowPort_Port >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class FlowPortPort {
    public static final String STEREOTYPE_NAME = "FlowPort_Port";

    public static final String FLOWPORT_PORT_DIRECTION_TAGTYPE = "FlowPort_Port_direction";

    public static final String FLOWPORT_PORT_ISATOMIC_TAGTYPE = "FlowPort_Port_isAtomic";

    /**
     * The underlying {@link Port} represented by this proxy, never null.
     */
    protected final Port elt;

    /**
     * Tells whether a {@link FlowPortPort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << FlowPort_Port >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, FlowPortPort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << FlowPort_Port >> then instantiate a {@link FlowPortPort} proxy.
     * 
     * @return a {@link FlowPortPort} proxy on the created {@link Port}.
     */
    public static FlowPortPort create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, FlowPortPort.STEREOTYPE_NAME);
        return FlowPortPort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link FlowPortPort} proxy from a {@link Port} stereotyped << FlowPort_Port >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link FlowPortPort} proxy or <i>null</i>.
     */
    public static FlowPortPort instantiate(final Port obj) {
        return FlowPortPort.canInstantiate(obj) ? new FlowPortPort(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FlowPortPort} proxy from a {@link Port} stereotyped << FlowPort_Port >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Port}
     * @return a {@link FlowPortPort} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static FlowPortPort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (FlowPortPort.canInstantiate(obj))
        	return new FlowPortPort(obj);
        else
        	throw new IllegalArgumentException("FlowPortPort: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        FlowPortPort other = (FlowPortPort) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}. 
     * @return the Port represented by this proxy, never null.
     */
    public Port getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'FlowPort_Port_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getFlowPort_Port_direction() {
        return this.elt.getTagValue(FlowPortPort.MdaTypes.FLOWPORT_PORT_DIRECTION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'FlowPort_Port_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isFlowPort_Port_isAtomic() {
        return this.elt.isTagged(FlowPortPort.MdaTypes.FLOWPORT_PORT_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'FlowPort_Port_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setFlowPort_Port_direction(final String value) {
        this.elt.putTagValue(FlowPortPort.MdaTypes.FLOWPORT_PORT_DIRECTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'FlowPort_Port_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setFlowPort_Port_isAtomic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(FlowPortPort.MdaTypes.FLOWPORT_PORT_ISATOMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(FlowPortPort.MdaTypes.FLOWPORT_PORT_ISATOMIC_TAGTYPE_ELT);
    }

    protected FlowPortPort(final Port elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType FLOWPORT_PORT_ISATOMIC_TAGTYPE_ELT;

        public static TagType FLOWPORT_PORT_DIRECTION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0247a67c-0ccf-11df-8525-001302895b2b");
            FLOWPORT_PORT_ISATOMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0247a67d-0ccf-11df-8525-001302895b2b");
            FLOWPORT_PORT_DIRECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0247a67f-0ccf-11df-8525-001302895b2b");
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
