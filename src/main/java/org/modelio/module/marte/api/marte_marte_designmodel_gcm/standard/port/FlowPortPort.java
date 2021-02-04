/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.port;

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
@objid ("b7661c2b-574d-4cc1-873e-fd57695b9bb0")
public class FlowPortPort {
    @objid ("fa69b6bb-9d08-4baf-8cb6-e921ab8f0386")
    public static final String STEREOTYPE_NAME = "FlowPort_Port";

    @objid ("001f4a12-c22d-40b4-a84a-6ecea74bf750")
    public static final String FLOWPORT_PORT_DIRECTION_TAGTYPE = "FlowPort_Port_direction";

    @objid ("a23404b6-3dd2-4e77-9d27-34f4bf7d7c1b")
    public static final String FLOWPORT_PORT_ISATOMIC_TAGTYPE = "FlowPort_Port_isAtomic";

    /**
     * The underlying {@link Port} represented by this proxy, never null.
     */
    @objid ("d70a905c-ebb2-424e-8db7-f1008772c69a")
    protected final Port elt;

    /**
     * Tells whether a {@link FlowPortPort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << FlowPort_Port >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("78c1cde8-56c7-4706-a8ee-fb35c2f97d4f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, FlowPortPort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << FlowPort_Port >> then instantiate a {@link FlowPortPort} proxy.
     * 
     * @return a {@link FlowPortPort} proxy on the created {@link Port}.
     */
    @objid ("cd1d2be8-6576-4842-9cbf-930f0c409d8b")
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
    @objid ("b1a0a604-a9d5-4eb4-9d66-d18da44d1269")
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
    @objid ("e5e936e3-e6b6-4f27-a444-ea70c1699b38")
    public static FlowPortPort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (FlowPortPort.canInstantiate(obj))
        	return new FlowPortPort(obj);
        else
        	throw new IllegalArgumentException("FlowPortPort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7723aa4f-80e6-4a2b-85e2-f150c97c219c")
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
    @objid ("26b86547-9868-4bfd-90da-f584f007d48a")
    public Port getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'FlowPort_Port_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4576289a-547f-4d08-b5c9-8b2c94ec8255")
    public String getFlowPort_Port_direction() {
        return this.elt.getTagValue(FlowPortPort.MdaTypes.FLOWPORT_PORT_DIRECTION_TAGTYPE_ELT);
    }

    @objid ("272ce019-dc8c-4586-9d23-979b371fda41")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'FlowPort_Port_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("706600f1-d00a-4313-834e-3ade2b1d91c5")
    public boolean isFlowPort_Port_isAtomic() {
        return this.elt.isTagged(FlowPortPort.MdaTypes.FLOWPORT_PORT_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'FlowPort_Port_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("840af154-ff23-484d-99e7-69937aff58cd")
    public void setFlowPort_Port_direction(final String value) {
        this.elt.putTagValue(FlowPortPort.MdaTypes.FLOWPORT_PORT_DIRECTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'FlowPort_Port_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7af95f70-9853-4b63-976e-d0712d5cc1dd")
    public void setFlowPort_Port_isAtomic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(FlowPortPort.MdaTypes.FLOWPORT_PORT_ISATOMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(FlowPortPort.MdaTypes.FLOWPORT_PORT_ISATOMIC_TAGTYPE_ELT);
    }

    @objid ("c9197c81-2751-4f34-a398-d5c2b9c6ed48")
    protected FlowPortPort(final Port elt) {
        this.elt = elt;
    }

    @objid ("83cc7522-221d-4aab-b593-4983b4a16738")
    public static final class MdaTypes {
        @objid ("c6d658a9-a6a3-424e-8dc3-bec99426ba8b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d5a61db2-7490-4ad6-9156-a518b3e66916")
        public static TagType FLOWPORT_PORT_ISATOMIC_TAGTYPE_ELT;

        @objid ("7fba2038-258c-4b8b-bb19-6f232f81d60b")
        public static TagType FLOWPORT_PORT_DIRECTION_TAGTYPE_ELT;

        @objid ("23500703-b350-4c80-9a22-a1d21abda0bd")
        private static Stereotype MDAASSOCDEP;

        @objid ("58aa4f11-3fac-421f-b83b-31cb0905ca57")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3fa2460a-a382-44c9-9e92-bcf0b235bd60")
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
