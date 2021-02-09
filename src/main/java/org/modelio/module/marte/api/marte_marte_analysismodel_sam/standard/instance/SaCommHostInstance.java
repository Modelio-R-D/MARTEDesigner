/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.instance.GaCommHostInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << SaCommHost_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SaCommHostInstance extends GaCommHostInstance {
    public static final String STEREOTYPE_NAME = "SaCommHost_Instance";

    public static final String SACOMMHOST_INSTANCE_ISSCHED_TAGTYPE = "SaCommHost_Instance_isSched";

    public static final String SACOMMHOST_INSTANCE_SCHSLACK_TAGTYPE = "SaCommHost_Instance_schSlack";

    /**
     * Tells whether a {@link SaCommHostInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SaCommHost_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SaCommHost_Instance >> then instantiate a {@link SaCommHostInstance} proxy.
     * 
     * @return a {@link SaCommHostInstance} proxy on the created {@link Instance}.
     */
    public static SaCommHostInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostInstance.STEREOTYPE_NAME);
        return SaCommHostInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SaCommHostInstance} proxy from a {@link Instance} stereotyped << SaCommHost_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SaCommHostInstance} proxy or <i>null</i>.
     */
    public static SaCommHostInstance instantiate(final Instance obj) {
        return SaCommHostInstance.canInstantiate(obj) ? new SaCommHostInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaCommHostInstance} proxy from a {@link Instance} stereotyped << SaCommHost_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SaCommHostInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SaCommHostInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SaCommHostInstance.canInstantiate(obj))
        	return new SaCommHostInstance(obj);
        else
        	throw new IllegalArgumentException("SaCommHostInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SaCommHostInstance other = (SaCommHostInstance) obj;
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
     * Getter for string property 'SaCommHost_Instance_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSaCommHost_Instance_schSlack() {
        return this.elt.getTagValue(SaCommHostInstance.MdaTypes.SACOMMHOST_INSTANCE_SCHSLACK_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaCommHost_Instance_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSaCommHost_Instance_isSched() {
        return this.elt.isTagged(SaCommHostInstance.MdaTypes.SACOMMHOST_INSTANCE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaCommHost_Instance_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaCommHost_Instance_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaCommHostInstance.MdaTypes.SACOMMHOST_INSTANCE_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaCommHostInstance.MdaTypes.SACOMMHOST_INSTANCE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaCommHost_Instance_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSaCommHost_Instance_schSlack(final String value) {
        this.elt.putTagValue(SaCommHostInstance.MdaTypes.SACOMMHOST_INSTANCE_SCHSLACK_TAGTYPE_ELT, value);
    }

    protected SaCommHostInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SACOMMHOST_INSTANCE_ISSCHED_TAGTYPE_ELT;

        public static TagType SACOMMHOST_INSTANCE_SCHSLACK_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "039c924a-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_INSTANCE_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c9251-0ccf-11df-8525-001302895b2b");
            SACOMMHOST_INSTANCE_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "039c9258-0ccf-11df-8525-001302895b2b");
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
