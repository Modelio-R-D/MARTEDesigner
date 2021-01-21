/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.association;

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
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.association.GaCommHostAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << SaCommHost_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("0981a1b1-3775-40bc-bfc5-723081556366")
public class SaCommHostAssociation extends GaCommHostAssociation {
    @objid ("9bac2831-7315-40fd-995d-7481860adcae")
    public static final String STEREOTYPE_NAME = "SaCommHost_Association";

    @objid ("89eab7a0-73d5-4874-a522-9a35c5524dbf")
    public static final String SACOMMHOST_ASSOCIATION_ISSCHED_TAGTYPE = "SaCommHost_Association_isSched";

    @objid ("2591cef8-2644-4901-b63f-687f887b28a9")
    public static final String SACOMMHOST_ASSOCIATION_SCHSLACK_TAGTYPE = "SaCommHost_Association_schSlack";

    /**
     * Tells whether a {@link SaCommHostAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << SaCommHost_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9df9c639-45e3-4271-a363-5089efe6dc23")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << SaCommHost_Association >> then instantiate a {@link SaCommHostAssociation} proxy.
     * 
     * @return a {@link SaCommHostAssociation} proxy on the created {@link Association}.
     */
    @objid ("696df7ce-efe1-4fef-b153-de96500854a9")
    public static SaCommHostAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaCommHostAssociation.STEREOTYPE_NAME);
        return SaCommHostAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link SaCommHostAssociation} proxy from a {@link Association} stereotyped << SaCommHost_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link SaCommHostAssociation} proxy or <i>null</i>.
     */
    @objid ("a4ec2d08-22d4-4eb0-8c55-099435d9c060")
    public static SaCommHostAssociation instantiate(final Association obj) {
        return SaCommHostAssociation.canInstantiate(obj) ? new SaCommHostAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaCommHostAssociation} proxy from a {@link Association} stereotyped << SaCommHost_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link SaCommHostAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cdd0a2e6-1407-460c-9ff2-224bb34584cb")
    public static SaCommHostAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (SaCommHostAssociation.canInstantiate(obj))
        	return new SaCommHostAssociation(obj);
        else
        	throw new IllegalArgumentException("SaCommHostAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("65a86364-0dd1-44ab-9da5-9a5dc7747629")
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
        SaCommHostAssociation other = (SaCommHostAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("f51cc0aa-5685-489b-8fc9-2f968fe9eee2")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'SaCommHost_Association_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("653cbda5-d96d-4c13-ab31-3143829f0395")
    public String getSaCommHost_Association_schSlack() {
        return this.elt.getTagValue(SaCommHostAssociation.MdaTypes.SACOMMHOST_ASSOCIATION_SCHSLACK_TAGTYPE_ELT);
    }

    @objid ("29b4e186-fdd7-4ad6-a758-ea451c4474bd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaCommHost_Association_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5ccaf13b-8f7e-443a-b3cc-799a24c0d112")
    public boolean isSaCommHost_Association_isSched() {
        return this.elt.isTagged(SaCommHostAssociation.MdaTypes.SACOMMHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaCommHost_Association_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("16a67c79-0579-4a2a-9f2a-a253edb7ebbb")
    public void setSaCommHost_Association_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaCommHostAssociation.MdaTypes.SACOMMHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaCommHostAssociation.MdaTypes.SACOMMHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaCommHost_Association_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("374f84c1-c635-44e3-b29d-443a098a71db")
    public void setSaCommHost_Association_schSlack(final String value) {
        this.elt.putTagValue(SaCommHostAssociation.MdaTypes.SACOMMHOST_ASSOCIATION_SCHSLACK_TAGTYPE_ELT, value);
    }

    @objid ("39d18faa-783b-44c2-9fe7-c2eb8a1ce58b")
    protected SaCommHostAssociation(final Association elt) {
        super(elt);
    }

    @objid ("887b9116-f438-4d01-af83-07677f6679cb")
    public static final class MdaTypes {
        @objid ("737b6224-4fd2-4610-8cef-db28963a4a48")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("12800c23-fb14-417b-80c4-b412d70dcbf4")
        public static TagType SACOMMHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT;

        @objid ("6d768fa9-3c69-4e55-b001-33a4ccc95e4d")
        public static TagType SACOMMHOST_ASSOCIATION_SCHSLACK_TAGTYPE_ELT;

        @objid ("222c6954-0084-40ca-bb8f-e08863f92573")
        private static Stereotype MDAASSOCDEP;

        @objid ("a0f91560-e1e6-4bc6-9b20-a2f97e382c86")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c04c88bd-7be2-4dfd-9f8d-def942a68dd7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b3a8fff1-14ad-11df-9d54-0014222a9f79");
            SACOMMHOST_ASSOCIATION_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3a8fff2-14ad-11df-9d54-0014222a9f79");
            SACOMMHOST_ASSOCIATION_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b3a8fff3-14ad-11df-9d54-0014222a9f79");
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
