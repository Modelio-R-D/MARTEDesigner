/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.instance.SchedulableResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << GaCommChannel_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GaCommChannelInstance extends SchedulableResourceInstance {
    public static final String STEREOTYPE_NAME = "GaCommChannel_Instance";

    public static final String GACOMMCHANNEL_INSTANCE_PACKETSIZE_TAGTYPE = "GaCommChannel_Instance_packetSize";

    public static final String GACOMMCHANNEL_INSTANCE_UTILIZATION_TAGTYPE = "GaCommChannel_Instance_utilization";

    /**
     * Tells whether a {@link GaCommChannelInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << GaCommChannel_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << GaCommChannel_Instance >> then instantiate a {@link GaCommChannelInstance} proxy.
     * 
     * @return a {@link GaCommChannelInstance} proxy on the created {@link Instance}.
     */
    public static GaCommChannelInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaCommChannelInstance.STEREOTYPE_NAME);
        return GaCommChannelInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link GaCommChannelInstance} proxy from a {@link Instance} stereotyped << GaCommChannel_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link GaCommChannelInstance} proxy or <i>null</i>.
     */
    public static GaCommChannelInstance instantiate(final Instance obj) {
        return GaCommChannelInstance.canInstantiate(obj) ? new GaCommChannelInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaCommChannelInstance} proxy from a {@link Instance} stereotyped << GaCommChannel_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link GaCommChannelInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GaCommChannelInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (GaCommChannelInstance.canInstantiate(obj))
        	return new GaCommChannelInstance(obj);
        else
        	throw new IllegalArgumentException("GaCommChannelInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GaCommChannelInstance other = (GaCommChannelInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'GaCommChannel_Instance_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGaCommChannel_Instance_packetSize() {
        return this.elt.getTagValue(GaCommChannelInstance.MdaTypes.GACOMMCHANNEL_INSTANCE_PACKETSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GaCommChannel_Instance_utilization'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGaCommChannel_Instance_utilization() {
        return this.elt.getTagValues(GaCommChannelInstance.MdaTypes.GACOMMCHANNEL_INSTANCE_UTILIZATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaCommChannel_Instance_packetSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommChannel_Instance_packetSize(final String value) {
        this.elt.putTagValue(GaCommChannelInstance.MdaTypes.GACOMMCHANNEL_INSTANCE_PACKETSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GaCommChannel_Instance_utilization'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGaCommChannel_Instance_utilization(final List<String> values) {
        this.elt.putTagValues(GaCommChannelInstance.MdaTypes.GACOMMCHANNEL_INSTANCE_UTILIZATION_TAGTYPE_ELT, values);
    }

    protected GaCommChannelInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GACOMMCHANNEL_INSTANCE_PACKETSIZE_TAGTYPE_ELT;

        public static TagType GACOMMCHANNEL_INSTANCE_UTILIZATION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "036f462f-0ccf-11df-8525-001302895b2b");
            GACOMMCHANNEL_INSTANCE_PACKETSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036f4636-0ccf-11df-8525-001302895b2b");
            GACOMMCHANNEL_INSTANCE_UTILIZATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "036f463d-0ccf-11df-8525-001302895b2b");
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
