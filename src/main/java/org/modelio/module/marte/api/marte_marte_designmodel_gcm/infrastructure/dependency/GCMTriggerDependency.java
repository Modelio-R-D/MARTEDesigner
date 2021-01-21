/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.infrastructure.dependency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link Dependency} with << GCMTrigger_Dependency >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("76de3f53-3536-43b8-98bc-f6c665732bc6")
public class GCMTriggerDependency {
    @objid ("837e673c-e623-49de-9707-01f28359b163")
    public static final String STEREOTYPE_NAME = "GCMTrigger_Dependency";

    @objid ("9bd2c801-9ea0-4ecd-8643-b6660fd40796")
    public static final String GCMTRIGGER_DEPENDENCY_FEATURE_TAGTYPE = "GCMTrigger_Dependency_feature";

    @objid ("703601bb-966a-4c45-aab1-9128d2f4156a")
    public static final String GCMTRIGGER_DEPENDENCY_PORT_TAGTYPE = "GCMTrigger_Dependency_port";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("c9b7b07a-10dd-408a-a803-1a85365b0623")
    protected final Dependency elt;

    /**
     * Tells whether a {@link GCMTriggerDependency proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << GCMTrigger_Dependency >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5f184bfc-8300-45cf-893f-ff3c3105277f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GCMTriggerDependency.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << GCMTrigger_Dependency >> then instantiate a {@link GCMTriggerDependency} proxy.
     * 
     * @return a {@link GCMTriggerDependency} proxy on the created {@link Dependency}.
     */
    @objid ("bc3b1015-daaa-4848-ac96-60d314f6a63b")
    public static GCMTriggerDependency create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GCMTriggerDependency.STEREOTYPE_NAME);
        return GCMTriggerDependency.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link GCMTriggerDependency} proxy from a {@link Dependency} stereotyped << GCMTrigger_Dependency >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link GCMTriggerDependency} proxy or <i>null</i>.
     */
    @objid ("5475f529-31a5-4744-b712-15ad8e868d24")
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
    @objid ("8c81f007-ef16-4817-b6ed-59bb02adfb4f")
    public static GCMTriggerDependency safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (GCMTriggerDependency.canInstantiate(obj))
        	return new GCMTriggerDependency(obj);
        else
        	throw new IllegalArgumentException("GCMTriggerDependency: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("44d3172a-0cc2-419c-8b7b-a6b9fa517479")
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
    @objid ("429f19eb-a24a-4844-9f9b-ebb6e57849b9")
    public Dependency getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'GCMTrigger_Dependency_feature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1464f6c6-e099-4a71-b2ec-f0fcfcbdf5ec")
    public String getGCMTrigger_Dependency_feature() {
        return this.elt.getTagValue(GCMTriggerDependency.MdaTypes.GCMTRIGGER_DEPENDENCY_FEATURE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'GCMTrigger_Dependency_port'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("70c6fc2c-cf50-4e56-8eff-0cec2f4db312")
    public List<String> getGCMTrigger_Dependency_port() {
        return this.elt.getTagValues(GCMTriggerDependency.MdaTypes.GCMTRIGGER_DEPENDENCY_PORT_TAGTYPE_ELT);
    }

    @objid ("eb83583c-7ac4-42f0-8779-9bc06a491102")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GCMTrigger_Dependency_feature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("176bd810-eb95-455e-965b-32f976c5a19f")
    public void setGCMTrigger_Dependency_feature(final String value) {
        this.elt.putTagValue(GCMTriggerDependency.MdaTypes.GCMTRIGGER_DEPENDENCY_FEATURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'GCMTrigger_Dependency_port'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f88ac800-f9ca-483d-91df-8787195bf8c8")
    public void setGCMTrigger_Dependency_port(final List<String> values) {
        this.elt.putTagValues(GCMTriggerDependency.MdaTypes.GCMTRIGGER_DEPENDENCY_PORT_TAGTYPE_ELT, values);
    }

    @objid ("8c94d8d4-4f83-40d6-8455-251c55c93166")
    protected GCMTriggerDependency(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("5d7026a5-89b1-485c-be7f-883382796d02")
    public static final class MdaTypes {
        @objid ("d7d8f44f-2d48-4298-8143-e49c8864eaba")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ba20e42c-59ff-446e-ae03-d28a45c75bf3")
        public static TagType GCMTRIGGER_DEPENDENCY_FEATURE_TAGTYPE_ELT;

        @objid ("04cadd0e-2222-4589-9c60-087d5a2193ca")
        public static TagType GCMTRIGGER_DEPENDENCY_PORT_TAGTYPE_ELT;

        @objid ("f9e838de-7e6e-4eaa-9e91-4b22950ac0c3")
        private static Stereotype MDAASSOCDEP;

        @objid ("f82aa346-a871-4b6a-acc7-1f1e5506900d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7b57bb92-24f9-4b06-9a35-bfd35ed59173")
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
