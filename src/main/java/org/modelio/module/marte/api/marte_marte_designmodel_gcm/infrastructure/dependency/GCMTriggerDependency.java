/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.infrastructure.dependency;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << GCMTrigger_Dependency >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class GCMTriggerDependency {
    public static final String STEREOTYPE_NAME = "GCMTrigger_Dependency";

    public static final String GCMTRIGGER_DEPENDENCY_FEATURE_TAGTYPE = "GCMTrigger_Dependency_feature";

    public static final String GCMTRIGGER_DEPENDENCY_PORT_TAGTYPE = "GCMTrigger_Dependency_port";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    protected final Dependency elt;

    /**
     * Tells whether a {@link GCMTriggerDependency proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << GCMTrigger_Dependency >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GCMTriggerDependency.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << GCMTrigger_Dependency >> then instantiate a {@link GCMTriggerDependency} proxy.
     * 
     * @return a {@link GCMTriggerDependency} proxy on the created {@link Dependency}.
     */
    public static GCMTriggerDependency create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GCMTriggerDependency.STEREOTYPE_NAME);
        return GCMTriggerDependency.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link GCMTriggerDependency} proxy from a {@link Dependency} stereotyped << GCMTrigger_Dependency >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link GCMTriggerDependency} proxy or <i>null</i>.
     */
    public static GCMTriggerDependency instantiate(final Dependency obj) {
        return GCMTriggerDependency.canInstantiate(obj) ? new GCMTriggerDependency(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GCMTriggerDependency} proxy from a {@link Dependency} stereotyped << GCMTrigger_Dependency >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link GCMTriggerDependency} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static GCMTriggerDependency safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (GCMTriggerDependency.canInstantiate(obj))
        	return new GCMTriggerDependency(obj);
        else
        	throw new IllegalArgumentException("GCMTriggerDependency: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        GCMTriggerDependency other = (GCMTriggerDependency) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    public Dependency getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GCMTrigger_Dependency_feature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getGCMTrigger_Dependency_feature() {
        return this.elt.getTagValue(GCMTriggerDependency.MdaTypes.GCMTRIGGER_DEPENDENCY_FEATURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GCMTrigger_Dependency_port'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getGCMTrigger_Dependency_port() {
        return this.elt.getTagValues(GCMTriggerDependency.MdaTypes.GCMTRIGGER_DEPENDENCY_PORT_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GCMTrigger_Dependency_feature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGCMTrigger_Dependency_feature(final String value) {
        this.elt.putTagValue(GCMTriggerDependency.MdaTypes.GCMTRIGGER_DEPENDENCY_FEATURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GCMTrigger_Dependency_port'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setGCMTrigger_Dependency_port(final List<String> values) {
        this.elt.putTagValues(GCMTriggerDependency.MdaTypes.GCMTRIGGER_DEPENDENCY_PORT_TAGTYPE_ELT, values);
    }

    protected GCMTriggerDependency(final Dependency elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType GCMTRIGGER_DEPENDENCY_FEATURE_TAGTYPE_ELT;

        public static TagType GCMTRIGGER_DEPENDENCY_PORT_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "025856b4-0ccf-11df-8525-001302895b2b");
            GCMTRIGGER_DEPENDENCY_FEATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "025f7daa-0ccf-11df-8525-001302895b2b");
            GCMTRIGGER_DEPENDENCY_PORT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "59e604c9-125f-11df-8f55-0014222a9f79");
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
